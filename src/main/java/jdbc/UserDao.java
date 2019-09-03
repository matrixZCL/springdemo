package jdbc;

import java.util.List;

public interface UserDao {
    public void insert(User user);
    public void delete(int id);
    public void update(User user);
    public User selectById(int id);
    public List<User> selectAll();
}
