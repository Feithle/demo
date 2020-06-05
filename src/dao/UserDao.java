package dao;

import entity.User;

/**
 * 只声明，不实现
 */
public interface UserDao {
    //添加用户
    public void add(User user);
    //根据email查询用户
    public User quarryUser(String email);
    //判断邮箱是否存在
    public boolean vertifyEmail(String email);
}
