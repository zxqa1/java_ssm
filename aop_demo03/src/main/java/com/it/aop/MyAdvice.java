package com.it.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

// 通知类
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.it.dao.BrandDao.update())")
    private void aop(){};

    @Before("aop()")
    // 共性功能 通知
    public void method(){
        System.out.println(System.currentTimeMillis());
    }

    @Pointcut("execution(* com.it.dao.*Dao.findNameByID(..))")
    private void daoPt(){}

    @Before("daoPt()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs(); // 获取参数，其他通知类型方法也一样
        System.out.println("before advice ...");
    }

    @After("daoPt()")
    public void after(){
        System.out.println("after advice ...");
    }

    // 环绕通知需要返回原方法的返回值，所以环绕通知的方法的返回值类型需为 Object
    // 并在方法最后将其返回
    // 可以获取返回值
    // 可以获取异常
    @Around("daoPt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        args[0] = 10000000;
        Object proceed = pjp.proceed(args);

        return proceed;
    }

    // 可以获取返回值
    // JoinPoint 位于第一个参数
    @AfterReturning(value = "daoPt()", returning = "ret")
    public void afterReturning(JoinPoint joinPoint, Object ret){
        System.out.println("afterReturning advice ...");
    }

    // 可以获取异常
    // JoinPoint 位于第一个参数
    @AfterThrowing(value = "daoPt()", throwing = "throwable")
    public void afterThrowing(JoinPoint joinPoint, Throwable throwable){
        System.out.println("afterThrowing advice ...");
    }
}
