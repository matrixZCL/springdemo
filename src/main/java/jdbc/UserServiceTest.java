package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("config/jdbc.xml");
        UserService us=(UserService) context.getBean("userService");
        us.regist(new User( 100,"dog","123"));
        System.out.println(us.getClass().getSimpleName());

    }

}
