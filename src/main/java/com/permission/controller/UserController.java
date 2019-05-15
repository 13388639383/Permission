package com.permission.controller;

import com.permission.Util.ResponseResult;
import com.permission.domain.Users;
import com.permission.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {

    private final UsersService usersService;

    private static Logger userLogger = LoggerFactory.getLogger(UserController.class);


    public UserController(UsersService userService) {
        this.usersService = userService;
    }

    @PostMapping("/login")
    public ResponseResult<Users> userLogin(@RequestBody Users users, HttpServletRequest httpServletRequest){
        ResponseResult<Users> userResponseResult = new ResponseResult<>();
        HttpSession httpSession = httpServletRequest.getSession();
        userLogger.info("管理员登录->["+users+"]");
        try {
            httpSession.setAttribute("users",users);
            userResponseResult.setMessage("登录成功");
            userResponseResult.setData(usersService.UserLogin(users.getUsername(),users.getPassword()));
            userResponseResult.setStatus(ResponseResult.STATE_OK);

        }catch (Exception e){
            e.printStackTrace();
            userResponseResult.setStatus(ResponseResult.STATE_ERROR);
            userResponseResult.setData(null);
            userResponseResult.setMessage("用户名或密码不正确");
        }
        return userResponseResult;
    }

}
