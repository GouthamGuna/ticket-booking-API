package in.dev.gmsk.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class VehicleOwnerAspect {
    private final Logger logger = LoggerFactory.getLogger(VehicleOwnerAspect.class);

    @Before(value = "execution(* in.dev.gmsk.controller.VehicleOwnerController.*(..))")
    public void beforeCallingMethod(JoinPoint joinpoint){
        logger.info("Requesting to {} End time : %s".formatted(new Date()), joinpoint.getSignature());
    }

    @After(value = "execution(* in.dev.gmsk.controller.VehicleOwnerController.*(..))")
    public void afterCallingMethod(JoinPoint joinpoint){
        logger.info("Requesting to {} End time : %s".formatted(new Date()), joinpoint.getSignature());
    }
}
