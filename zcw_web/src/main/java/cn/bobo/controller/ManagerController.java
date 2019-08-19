package cn.bobo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author: bobobo
 * @Date: 2019/8/19 19:27
 * @Version：1.0
 */
@Controller
@RequestMapping("/manage")
public class ManagerController {
    @RequestMapping("/main")
    public String main(){
        return "manage/main";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
