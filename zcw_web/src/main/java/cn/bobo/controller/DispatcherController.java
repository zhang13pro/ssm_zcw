package cn.bobo.controller;

import cn.bobo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/dologin")
    public String dologin(String loginacct,String userpswd){

        return "";
    }


}
