package com.permission.service.Impl;

import com.permission.dao.DateBaseDAO;
import com.permission.domain.Roles;
import com.permission.service.RolesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImpl implements RolesService {

    private static Logger RoleLoger = LoggerFactory.getLogger(RolesServiceImpl.class);
    @Autowired
    DateBaseDAO dateBaseDAO;
    @Override
    public List<Roles> getRoles(){
        return dateBaseDAO.getRoles();
    }

    @Override
    public boolean addRoles(String rolename, String rolemessage, String role1, String role2, String role3, String role4) {
        RoleLoger.info(role1+role2+role3+role4);
        return dateBaseDAO.addRoles(rolename,rolemessage,role1,role2,role3,role4);
    }

    @Override
    public boolean deleteRoles(int id) {
        return  dateBaseDAO.deleteRoles(id);
    }

}
