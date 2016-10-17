package temp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.web.header.HeaderWriterFilter;
import org.springframework.web.filter.RequestContextFilter;

@SpringBootApplication
@EnableAspectJAutoProxy (proxyTargetClass = true)
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).run(args);
	}

	@LoadBalanced
	@Bean
	public OAuth2RestTemplate restTemplate(OAuth2ProtectedResourceDetails resource, OAuth2ClientContext context) {
		return new OAuth2RestTemplate(resource, context);
	}

	@Configuration
	@EnableOAuth2Sso
	protected static class SecurityConfiguration extends WebSecurityConfigurerAdapter {

		@Override
		public void configure(HttpSecurity http) throws Exception {
			http
				.logout()
				.and()
				.antMatcher("/**")
				.authorizeRequests()
				.antMatchers("/login", "/beans", "/hystrix.stream/**")
				.permitAll()
				.anyRequest()
				.authenticated()
				.and()
				.csrf()
				.disable()
				.addFilterBefore(new RequestContextFilter(), HeaderWriterFilter.class);

		}

	}

}
