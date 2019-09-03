package AOP;

public class ProxyTest {
    public static void main(String[] args){
        UserService us=new UserServiceImplProxy();
        us.regist();
    }
}
