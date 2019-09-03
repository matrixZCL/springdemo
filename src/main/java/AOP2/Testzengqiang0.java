package AOP2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testzengqiang0 {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("/config/applicationContext.xml");

        Service0 us=(Service0) context.getBean("ser0");
        System.out.println(us.getClass().getSimpleName());
        us.a();
        us.b();
    }
}
