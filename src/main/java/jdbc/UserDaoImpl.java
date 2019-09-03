package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao{
    private JdbcTemplate jt;

    public JdbcTemplate getJt() {
        return jt;
    }

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    public void insert(User user) {
        jt.update("insert into t_user values (?,?,?)",user.getId(),user.getUsername(),user.getPassword());
    }

    public void delete(int id) {
        jt.update("delete from t_user where id=?",id);
    }

    public void update(User user) {
        jt.update("update t_user set username=?,password=? where id=?",user.getUsername(),user.getPassword(),user.getId());
    }

    public User selectById(int id) {

        List<User> list=jt.query("select * from t_user where id=?", new RowMapper<User>() {

            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return new User(resultSet.getInt("id"),resultSet.getString("username"),resultSet.getString("password"));
            }
        }, id);
        if(list.size()<1){
            return null;
        }else {
            return list.get(0);
        }
    }

    public List<User> selectAll() {
        List<User> list=jt.query("select * from t_user where id=?", new RowMapper<User>() {

            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return new User(resultSet.getInt("id"),resultSet.getString("username"),resultSet.getString("password"));
            }
        });
        return list;
    }
}
