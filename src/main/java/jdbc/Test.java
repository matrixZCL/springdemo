package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("/config/jdbc.xml");
        JdbcTemplate jt=(JdbcTemplate) context.getBean("jt");
        System.out.println(jt);

        User u=new User();
        u.setUsername("tom");
        u.setPassword("123");

        jt.update("insert into t_user values (?,?,?)",u.getId(),u.getUsername(),u.getPassword());

        User us=jt.queryForObject(
                "select *from t_user where id=?",
                new RowMapper<User>() {
                    public User mapRow(ResultSet resultSet, int i) throws SQLException {
                        User u=new User(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3));
                        return u;
                    }
                },
                1
        );

        List<User> list=jt.query("select * from t_user", new RowMapper<User>() {
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user=new User(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3));
                return  user;
            }

        });
        System.out.println(us);
        for(User user :list){
            System.out.println(user);
        }
    }
}
