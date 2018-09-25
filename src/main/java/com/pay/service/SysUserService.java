package com.pay.service;

import com.pay.dao.UserDAO;
import com.pay.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class SysUserService {

    @Autowired
    UserDAO userDAO;

    public List<SysUser> findUser(){
        return userDAO.findUser();
    }
}
