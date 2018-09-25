package com.test.service;

import com.pay.dao.UserDAO;
import com.pay.model.SysUser;
import com.pay.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestUserDao {

    @Autowired
    private SysUserService userService;

    @Test
    public void testFindUser(){
        List<SysUser> userList = userService.findUser();
        for ( SysUser user: userList) {
            System.out.println(user.getNickname());
        }
    }
}
