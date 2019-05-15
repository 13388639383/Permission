package com.permission.service.Impl;

import com.permission.dao.DateBaseDAO;
import com.permission.domain.Users;
import com.permission.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    private static Logger UserLoger = LoggerFactory.getLogger(UsersServiceImpl.class);

    @Autowired
    DateBaseDAO dateBaseDAO;

    @Override
    public Users UserLogin(String username, String password) {
        UserLoger.info("Admin-Sign-IN"+username);
        return dateBaseDAO.userLogin(username,password);
    }
}
