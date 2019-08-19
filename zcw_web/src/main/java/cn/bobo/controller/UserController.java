package cn.bobo.controller;

import cn.bobo.bean.User;
import cn.bobo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author bobobo
 * @version 1.0
 * @date 2019/8/17 17:26
 * 测试用
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/findById")
    public String findOne(Model model){
        final User user = userService.findById(3);
        model.addAttribute("user",user);
        return "user";
/*        final Items items = itemsService.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";*/
    }
}
