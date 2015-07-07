package org.scheming.blog.controller;

import org.scheming.blog.dao.UserDao;
import org.scheming.blog.entitys.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Scheming on 2015/7/6.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name = "userDao")
    UserDao userDao;

    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    @ResponseBody
    public Object userRegister() {
        Map<String, Object> map=new HashMap<>();
        map.put("fd", "郝鹏");
        return map;
    }
}
