# spring-security-gethttp-invocation

15:39:15.691 WARN  o.s.b.c.e.AnnotationConfigEmbeddedWebApplicationContext  - Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'springSecurityFilterChain' defined in class path resource [org/springframework/security/config/annotation/web/configuration/WebSecurityConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [javax.servlet.Filter]: Factory method 'springSecurityFilterChain' threw exception; nested exception is java.lang.NullPointerException
15:39:15.694 INFO  o.a.catalina.core.StandardService  - Stopping service Tomcat
15:39:15.719 INFO  o.s.b.a.l.AutoConfigurationReportLoggingInitializer  - 

The exception is below.

Error starting ApplicationContext. To display the auto-configuration report re-run your application with 'debug' enabled.
15:39:15.728 ERROR o.s.boot.SpringApplication org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'springSecurityFilterChain' defined in class path resource [org/springframework/security/config/annotation/web/configuration/WebSecurityConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [javax.servlet.Filter]: Factory method 'springSecurityFilterChain' threw exception; nested exception is java.lang.NullPointerException
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:599)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1128)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1023)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:510)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:482)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:306)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:296)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:751)
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:861)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:541)
	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122)
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:761)
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:371)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:315)
	at org.springframework.boot.builder.SpringApplicationBuilder.run(SpringApplicationBuilder.java:134)
	at temp.Application.main(Application.java:21)
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [javax.servlet.Filter]: Factory method 'springSecurityFilterChain' threw exception; nested exception is java.lang.NullPointerException
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:189)
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:588)
	... 19 common frames omitted
Caused by: java.lang.NullPointerException: null
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter.getHttp(WebSecurityConfigurerAdapter.java:174)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.springframework.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:216)
	at org.springframework.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:201)
	at org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2SsoCustomConfiguration$SsoSecurityAdapter.invoke(OAuth2SsoCustomConfiguration.java:100)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179)
	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:655)
	at temp.Application$SecurityConfiguration$$EnhancerBySpringCGLIB$$edde82d3.init(<generated>)
	at org.springframework.security.config.annotation.AbstractConfiguredSecurityBuilder.init(AbstractConfiguredSecurityBuilder.java:371)
	at org.springframework.security.config.annotation.AbstractConfiguredSecurityBuilder.doBuild(AbstractConfiguredSecurityBuilder.java:325)
	at org.springframework.security.config.annotation.AbstractSecurityBuilder.build(AbstractSecurityBuilder.java:41)
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration.springSecurityFilterChain(WebSecurityConfiguration.java:104)
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration$$EnhancerBySpringCGLIB$$ee0e8f00.CGLIB$springSecurityFilterChain$5(<generated>)
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration$$EnhancerBySpringCGLIB$$ee0e8f00$$FastClassBySpringCGLIB$$e6ba2e.invoke(<generated>)
	at org.springframework.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)
	at org.springframework.context.annotation.ConfigurationClassEnhancer$BeanMethodInterceptor.intercept(ConfigurationClassEnhancer.java:356)
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration$$EnhancerBySpringCGLIB$$ee0e8f00.springSecurityFilterChain(<generated>)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:162)
	... 20 common frames omitted
 - Application startup failed
