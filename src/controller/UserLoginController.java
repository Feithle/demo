package controller;

import com.alibaba.fastjson.JSONObject;
import entity.ResoultOfUser;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;
import util.ResponseToJs;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/UserOp")
public class UserLoginController {
    @Resource
    private UserService userService;
    @Resource
    private ResponseToJs responseToJs;
    /**
     * TODO 读取cookie中保存的user信息，返回到js
     * @param request
     */
    @RequestMapping("/fillInputTag.do")
    public void fillInputTag(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取
        User user=userService.fillInputTag(request);
        //包装
        ResoultOfUser resoultOfUser=new ResoultOfUser();
        if(user !=null){
            resoultOfUser.setSuccess(true);
            resoultOfUser.setUser(user);
        }
        //输出
        String resultJson = JSONObject.toJSONString(user);
        responseToJs.response(resultJson,response);
    }

    @RequestMapping("/login.do")
    public void login(User user, HttpServletResponse response) throws IOException {
       ResoultOfUser resoultOfUser=userService.UserLoginVertify(user);

       if (resoultOfUser.success){
           if (resoultOfUser.getUser().getPassword().equals(user.getPassword())){
               //更新cookie
               userService.updateCookies(user,response);
               //提示
               resoultOfUser.setMsg("登录成功");
               //输出
               String resultJson = JSONObject.toJSONString(resoultOfUser);
               responseToJs.response(resultJson,response);
               //测试
               System.out.println(resultJson);
           }else{
               //提示
               resoultOfUser.setMsg("登录失败，密码错误");
               //输出
               String resultJson = JSONObject.toJSONString(resoultOfUser);
               responseToJs.response(resultJson,response);
           }
       }else {
           //提示
           resoultOfUser.setMsg("错误，用户不存在");
           //输出
           String resultJson = JSONObject.toJSONString(resoultOfUser);
           responseToJs.response(resultJson,response);
       }
    }
}