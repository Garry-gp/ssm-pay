package com.pay.dao;

import com.pay.model.SysUser;

import java.util.List;

public interface UserDAO {

    public List<SysUser> findUser();
}
