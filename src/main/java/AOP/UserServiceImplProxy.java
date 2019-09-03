package AOP;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class UserServiceImplProxy implements UserService {
    private UserService us=new UserServiceImpl();
    public void regist() {
        System.out.println("开启事务");

        us.regist();
        System.out.println("提交事务");
    }
}
