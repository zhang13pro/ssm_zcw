package cn.bobo.service.impl;

import cn.bobo.bean.User;
import cn.bobo.dao.IUserDao;
import cn.bobo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author bobobo
 * @version 1.0
 * @date 2019/8/17 23:34
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    //测试方法
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    public User queryLoginUser(User user) {
        return userDao.queryLoginUser(user);
    }
}
