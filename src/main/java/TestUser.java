import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("/config/applicationContext.xml");
        User user=(User)context.getBean("user0");
        System.out.println(user.getUsername());
        System.out.println(user.getAddr());
    }
}
