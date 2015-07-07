package org.scheming.blog.dao;

import org.hibernate.SessionFactory;
import org.scheming.blog.entitys.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Scheming on 2015/7/6.
 */
@Repository("userDao")
public class UserDao {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public void create(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
}
