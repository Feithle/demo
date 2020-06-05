package service;

import entity.ResoultOfUser;
import entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {
    //添加用户
    public void regist(String email, String password);
    //根据id返回完整用户
    public User getUserByEmail(String email);
    //更新cookie
    public void updateCookies(User user, HttpServletResponse response);
    //读取cookie
    public User fillInputTag(HttpServletRequest request);
    //登录用户
    public ResoultOfUser UserLoginVertify(User user);
}
