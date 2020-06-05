package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/UserOp")
public class UserRegistController {

    @Resource
    private UserService userService;

    @RequestMapping("/regist.do")
    public void regist(String email, String password, HttpServletResponse response){
        userService.regist(email,password);
        //更新cookie
        User user=userService.getUserByEmail(email);
        userService.updateCookies(user,response);
    }
}
