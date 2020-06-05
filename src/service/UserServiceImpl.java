package service;


import dao.UserDao;
import entity.ResoultOfUser;
import entity.User;
import org.springframework.stereotype.Service;
import util.ReadCookie;
import util.UpdateCookie;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    @Resource
    private UpdateCookie updateCookie;
    @Resource
    private ReadCookie readCookie;
    @Override
    public void regist(String email, String password) {
        User user=new User();
        user.setEmail(email);
        user.setPassword(password);
        userDao.add(user);
    }

    /**
     * TODO 根据email返回完整用户
     * @param email
     * @return
     */
    @Override
    public User getUserByEmail(String email) {
        User user=new User();
        user=userDao.quarryUser(email);
        return user;
    }

    /**
     * TODO 更新浏览器cookie
     */
    @Override
    public void updateCookies(User user , HttpServletResponse response) {
        if(updateCookie.insertCookies(user,response)){
            System.out.println("cookie更新完成");
        }
    }

    @Override
    public User fillInputTag(HttpServletRequest request) {
        return  readCookie.getCoolieInBrowser(request);
    }

    @Override
    public ResoultOfUser UserLoginVertify(User user) {
        ResoultOfUser resoultOfUser =new ResoultOfUser();
        resoultOfUser.setSuccess(userDao.vertifyEmail(user.getEmail()));
        if (resoultOfUser.success){
            resoultOfUser.setUser(userDao.quarryUser(user.getEmail()));
        }
        return resoultOfUser;
    }


}
