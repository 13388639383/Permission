package com.permission.controller;

import com.permission.Util.ResponseResult;
import com.permission.domain.Roles;
import com.permission.service.RolesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class roleController {

    @Autowired
    private RolesService rolesService;

    @GetMapping("/test")
    public List<Roles> getRoles() {
        return rolesService.getRoles();
    }

    @PostMapping("/delete")
    public ResponseResult<Boolean> deleteRole(@RequestBody Roles roles) {
        ResponseResult<Boolean> roleResult = new ResponseResult<>();
        try {
            boolean result = rolesService.deleteRoles(roles.getId());
            if (result) {
                roleResult.setMessage("删除角色成功");
                roleResult.setData(true);
                roleResult.setStatus(ResponseResult.STATE_OK);
            } else {
                System.out.println("删除角色失败");
                roleResult.setStatus(ResponseResult.STATE_ERROR);
                roleResult.setData(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            roleResult.setStatus(ResponseResult.STATE_ERROR);
            roleResult.setData(false);
            roleResult.setMessage("异常");
        }
        return roleResult;

    }

    @PostMapping("/addrole")
    public ResponseResult<Boolean> addRole(@RequestBody Roles roles) {
        ResponseResult<Boolean> roleResult = new ResponseResult<>();
        try {
            boolean result = rolesService.addRoles(roles.getRolename(), roles.getRolemessage(),roles.getRolepower());
            if (result) {
                roleResult.setMessage("添加角色成功");
                roleResult.setData(true);
                roleResult.setStatus(ResponseResult.STATE_OK);
            } else {
                System.out.println("添加角色失败");
                roleResult.setStatus(ResponseResult.STATE_ERROR);
                roleResult.setData(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            roleResult.setStatus(ResponseResult.STATE_ERROR);
            roleResult.setData(false);
            roleResult.setMessage("异常");
        }
        return roleResult;
    }
}
