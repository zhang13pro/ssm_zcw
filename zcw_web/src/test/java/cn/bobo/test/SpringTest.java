package cn.bobo.test;

import cn.bobo.bean.User;
import cn.bobo.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bobobo
 * @version 1.0
 * @date 2019/8/18 10:31
 */
public class SpringTest {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationConfig.xml");
        final IUserService userService = ac.getBean("userService",IUserService.class);
        final User user = userService.findById(3);
        System.out.println(user.getUsername());
    }
}
