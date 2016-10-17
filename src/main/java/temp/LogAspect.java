package temp;

import javax.annotation.PostConstruct;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

	@PostConstruct
	public void init() {
		LOGGER.info("log aspect initialized");
	}

	@Around (value = "execution (* temp.*.*(..))", argNames = "joinPoint")
	public Object aroundScreenBeansOfAydes(ProceedingJoinPoint joinPoint) throws Throwable {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();

		Object returnValue = null;
		long endTime = 0;
		long startTime = 0;

		startTime = System.nanoTime();
		returnValue = joinPoint.proceed();
		endTime = System.nanoTime();

		LOGGER.info(signature.toString() + " - duration " + (endTime - startTime) / 1000000);

		return returnValue;
	}

}
