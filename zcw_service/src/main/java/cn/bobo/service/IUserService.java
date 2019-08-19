package cn.bobo.service;

import cn.bobo.bean.User;

/**
 * @author bobobo
 * @version 1.0
 * @date 2019/8/17 23:33
 */
public interface IUserService {
    User findById(Integer id);

    User queryLoginUser(User user);
}
