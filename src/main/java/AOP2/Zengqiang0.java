package AOP2;



import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class Zengqiang0 implements MethodInterceptor {


    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("before");

        Object o=methodInvocation.proceed();

        System.out.println("after");

        return o;

    }
}
