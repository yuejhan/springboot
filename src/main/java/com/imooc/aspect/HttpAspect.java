package com.imooc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 16:30
 */
@Aspect
@Component
public class HttpAspect {

    private static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.imooc.controller.GirlController.*(..))")
    public void log(){}

    @Before("log()")
    public void doBefore(JoinPoint  joinPoint){
        logger.info("aspect before is called");

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

        logger.info("url = {}",request.getRequestURL());

        logger.info("method = {}",request.getMethod());

        logger.info("ip = {}",request.getRemoteAddr());

        logger.info("class = {}", joinPoint.getSignature().getDeclaringTypeName() + "."+joinPoint.getSignature().getName());

        logger.info("args={}",joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter(){
        logger.info("aspect after is called ");
    }

    @AfterReturning(pointcut = "log()",returning = "object")
    public void doReturning(Object object){
        logger.info("return={}",object);
    }
}
