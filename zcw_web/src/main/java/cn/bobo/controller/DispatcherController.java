package cn.bobo.controller;

import cn.bobo.bean.AJAXResult;
import cn.bobo.bean.User;
import cn.bobo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author bobobo
 * @version 1.0
 * @date 2019/8/18 23:03
 */
@Controller
public class DispatcherController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @ResponseBody
    @RequestMapping("/dologin")
    public Object dologin(User user, HttpSession session){
        AJAXResult result = new AJAXResult();
        try {
            User dbUser = userService.queryLoginUser(user);
            if (dbUser == null) {
                result.setSuccess(false);
            }else{
                session.setAttribute("loginUser",dbUser);
                result.setSuccess(true);
            }
        }catch (Exception e){
            e.printStackTrace();
            result.setSuccess(false);
        }
        return result;
    }

    /*@RequestMapping("/dologin")
    public String dologin(User user, HttpSession session){
        User dbUser = userService.queryLoginUser(user);
        if (dbUser == null) {
            String error = "用户名或密码错误";
            //保存提示信息
            session.setAttribute("errorMsg",error);
            session.setAttribute("loginUser",user);
            return "redirect:/login";
        }else{
            return "main";
        }
    }*/


}
