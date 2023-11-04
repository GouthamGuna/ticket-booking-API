package in.dev.gmsk.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class VehicleOwnerAspect {

    @Before(value = "execution(* in.dev.gmsk.controller.VehicleOwnerController.*(..))")
    public void beforeCallingMethod(JoinPoint joinpoint){
        System.out.println("Requesting to "+ joinpoint.getSignature() +" End time : "+ new Date());
    }

    @After(value = "execution(* in.dev.gmsk.controller.VehicleOwnerController.*(..))")
    public void afterCallingMethod(JoinPoint joinpoint){
        System.out.println("Requesting to "+ joinpoint.getSignature() +" End time : "+ new Date());
    }
}
