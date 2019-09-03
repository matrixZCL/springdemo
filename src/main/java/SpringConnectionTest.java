import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class SpringConnectionTest {
    public static  void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("/config/applicationContext.xml");
        Connection conn=(Connection) context.getBean("conn");
        System.out.println(conn);
    }
}
