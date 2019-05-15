package com.permission.service;

import com.permission.domain.Roles;

import java.util.List;

public interface RolesService {

    List<Roles> getRoles();

    boolean addRoles(String rolename, String rolemessage, String[] rolespower);

    boolean deleteRoles(int id);
}
