package AOP2;

import AOP.UserService;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//动态代理
public class Test {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("/config/applicationContext.xml");

        Service us=(Service) context.getBean("service");
        System.out.println(us.getClass().getSimpleName());
        us.service();
    }
}
