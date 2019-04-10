package com.example.aspect;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class HttpAspect {
	
	private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

	@Pointcut("execution(public * com.example.controller.GirlController.*(..))")
	public void log() {
	}
	@Before("log()")
	public void doBefore(JoinPoint joinPoint) {
		ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		
		//url
        logger.info("利用AOP记录每次请求的有关信息，url={}，method={}，ip={}", request.getRequestURL(), request.getMethod(), request.getRemoteAddr());

        //类方法 参数
        logger.info("class_method={}, args={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName(), joinPoint.getArgs());

	}
	
	@After("log()")
	public void doAfter() {
		logger.info("2222222222");
	}
	
	@AfterReturning(returning="object", pointcut= "log()")
	public void doAfterReturning(Object object) {
		logger.info("response={}",object);
	}
}
