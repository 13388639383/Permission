package com.permission.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class Roles implements Serializable {
    private int id;
    private String rolename;
    private String rolemessage;
    private String addpower;
    private String delpower;
    private String updpower;
    private String chepower;


    public Roles(int id, String rolename, String rolemessage, String addpower,String delpower,String updpower,String chepower) {
        this.id = id;
        this.rolename = rolename;
        this.rolemessage = rolemessage;
        this.addpower = addpower;
        this.delpower = delpower;
        this.updpower = updpower;
        this.chepower = chepower;
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

    public String getAddpower() {
        return addpower;
    }

    public void setAddpower(String addpower) {
        this.addpower = addpower;
    }

    public String getDelpower() {
        return delpower;
    }

    public void setDelpower(String delpower) {
        this.delpower = delpower;
    }

    public String getUpdpower() {
        return updpower;
    }

    public void setUpdpower(String updpower) {
        this.updpower = updpower;
    }

    public String getChepower() {
        return chepower;
    }

    public void setChepower(String chepower) {
        this.chepower = chepower;
    }
}
