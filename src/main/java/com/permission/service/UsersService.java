package com.permission.service;

import com.permission.domain.Users;

public interface UsersService {
    Users UserLogin(String username,String password);
}
