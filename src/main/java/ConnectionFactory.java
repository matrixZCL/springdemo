import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory implements FactoryBean<Connection> {


    public Connection getObject() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://47.101.210.40:3306/","root","password");
        return conn;
    }

    public Class<?> getObjectType() {
        return Connection.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
