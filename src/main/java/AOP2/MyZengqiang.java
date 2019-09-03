package AOP2;



import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class MyZengqiang implements MethodInterceptor {


    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("start");

        Object o=methodInvocation.proceed();
        System.out.println(methodInvocation.getMethod());
        System.out.println(methodInvocation.getThis());
        System.out.println(methodInvocation.getArguments());


        System.out.println("end");
        return o;
    }
}

