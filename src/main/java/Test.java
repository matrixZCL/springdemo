import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        //获得UserServiceImpl对象

        //创建spring工厂
        BeanFactory factory=new ClassPathXmlApplicationContext("config/applicationContext.xml");
        Person us=(Person) factory.getBean("person");
        System.out.println(us.getId());
        System.out.println(us.getFriend());
        System.out.println(us.getGirls());
    }
}
