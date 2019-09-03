package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Date;

public class LogAdvice implements MethodInterceptor {
    private Log log=LogFactory.getLog(LogAdvice.class);
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        log.info("time="+new Date()+ "");
        Object o=methodInvocation.proceed();
        return o;
    }
}
