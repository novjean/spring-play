package com.novjean.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class LoggingAspect {

	//@Around("@annotation(com.novjean.springaop.aspect.Loggable)")
	//@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		Object returnValue = null;
		try{
			System.out.println("Before advice.");
			returnValue = proceedingJoinPoint.proceed();// We can decide if the target method gets called or not
			System.out.println("After Returning.");
			
		} catch(Throwable e){
			System.out.println("After Throwing");
		}
		
		System.out.println("After finally.");
		return returnValue;
	}	
	
	public void LoggingAdvice(){
		System.out.println("Called logging advice.");
	}
	
//	@Pointcut("execution(* get*())")
//	public void allGetters(){}
	
	///////////////////////////////
	
	//@Before("execution(public String com.novjean.springaop.model.Circle.getName())")
	//@Before("execution(public String getName())")
	//@Before("execution(public * get*())")
	//@Before("execution(* get*(*))")
	//@Before("execution(* get*(..))")
	//@Before("execution(* com.novjean.springaop.model.*.get*(..))")
	//@Before("execution(* get*())")
	//@Before("allGetters() && allCircleMethods()")
	//@Before("args(String)")
	//@Before("args(name)")
//	@Before("allCircleMethods()")
//	public void LoggingAdvice(JoinPoint joinPoint){
//		
//	}
	
	//@After("args(name)")
	//@AfterReturning("args(name)")
//	@AfterReturning(pointcut="args(name)", returning="returnString")
//	public void stringArgumentMethods(String name, String returnString){
//		System.out.println("A method passed string: " + name + ", " + returnString);
//	}
//	
//	//@AfterThrowing("args(name)")
//	@AfterThrowing(pointcut="args(name)", throwing="ex")
//	public void exceptionAdvice(String name, Exception ex){
//		System.out.println("An exception has been thrown: " + name);
//	}
//	
//	@Around("@annotation(com.novjean.springaop.aspect.Loggable)")
//	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
//		Object returnValue = null;
//		try{
//			System.out.println("Before advice.");
//			returnValue = proceedingJoinPoint.proceed();// We can decide if the target method gets called or not
//			System.out.println("After Returning.");
//			
//		} catch(Throwable e){
//			System.out.println("After Throwing");
//		}
//		
//		System.out.println("After finally.");
//		return returnValue;
//	}
	
//	@Pointcut("execution(* get*())")
//	public void allGetters(){}
	
	//@Pointcut("execution(* * com.novjean.springaop.model.Circle.*(..))")
	//@Pointcut("within(com.novjean.springaop.model.*)")
	//@Pointcut("within(com.novjean.springaop.model..*)")
	//@Pointcut("execution(com.novjean.springaop.service.*.*(..))") //for all classes all functions for any params within a package
//	@Pointcut("within(com.novjean.springaop.model.Circle)")
//	public void allCircleMethods(){}
	
	
	
//	@Before("allGetters()")
//	public void secondAdvice(){
//		System.out.println("Second Advice executed.");
//	}
	
//	public void LoggingAdvice(JoinPoint joinPoint){
//		System.out.println(joinPoint.toString());
//		System.out.println(joinPoint.getTarget());
//		Circle circle = (Circle)joinPoint.getTarget();
//	}
	
	
}
