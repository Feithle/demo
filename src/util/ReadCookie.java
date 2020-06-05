package util;

import entity.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Service
public class ReadCookie {
    public User getCoolieInBrowser(HttpServletRequest request){
        Cookie cookie = null;
        Cookie[] cookies = null;
        User user =new User();
        cookies = request.getCookies();
        //System.out.println("cookie的长度： " + cookies.length);
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                /*
                 * cookie中有(注意在浏览器中的键名与这里的参数名不一致)
                 * 1.email 2.password 3.user_id 4.path_avatar
                 */
                if ((cookie.getName().compareTo("email_lqy")) == 0) {
                    user.setEmail(cookie.getValue().toString());
                }
                if ((cookie.getName().compareTo("password_lqy")) == 0) {
                    user.setPassword(cookie.getValue().toString());
                }
                if ((cookie.getName().compareTo("user_add_id_lqy")) == 0) {
                    user.setUser_id(Integer.parseInt(cookie.getValue().toString()));
                }
                if ((cookie.getName().compareTo("cookie_path_avatar_lqy")) == 0) {
                    user.setPath_avatar(cookie.getValue());
                    //user.setPath_avatar("F:/MyeclipseWorkSpace/server/src/main/webapp/ClientServer/avatar/1_3_2.png");
                }

            }
        }
        return user;
    }
}
