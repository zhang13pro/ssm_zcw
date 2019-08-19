package cn.bobo.dao;

import cn.bobo.bean.User;

/**
 * @author bobobo
 * @version 1.0
 * @date 2019/8/17 23:26
 */
public interface IUserDao {
    User findById(Integer id);

    User queryLoginUser(User user);
}
