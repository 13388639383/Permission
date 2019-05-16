package com.permission.service;

import com.permission.domain.Roles;

import java.util.List;

public interface RolesService {

    List<Roles> getRoles();

    boolean addRoles(String rolename, String rolemessage, String role1, String role2, String role3, String role4);

    boolean deleteRoles(int id);
}
