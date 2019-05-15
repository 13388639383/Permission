package com.permission.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class Roles implements Serializable {
    private int id;
    private String rolename;
    private String rolemessage;
    private String[] rolepower;
    public String[] getRolepower() {
        return rolepower;
    }

    public void setRolepower(String[] rolepower) {
        this.rolepower = rolepower;
    }

    public Roles(int id, String rolename, String rolemessage, String[] rolepower) {
        this.id = id;
        this.rolename = rolename;
        this.rolemessage = rolemessage;
        this.rolepower = rolepower;
    }
    public Roles(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRolemessage() {
        return rolemessage;
    }

    public void setRolemessage(String rolemessage) {
        this.rolemessage = rolemessage;
    }


}
