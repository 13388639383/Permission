package com.permission.dao;

import com.permission.domain.Roles;
import com.permission.domain.Users;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DateBaseDAO {


    @Select(" select * from roles")
    List<Roles> getRoles();

    @Select("select * from users where username = #{username} and password = #{password}")
    Users userLogin(@Param("username") String username,@Param("password") String password);

    @Insert("insert into roles (rolename, rolemessage,addpower,delpower,updpower,chepower) values (#{rolename},#{rolemessage},#{role1},#{role2},#{role3},#{role4})")
    boolean addRoles(@Param("rolename") String rolename, @Param("rolemessage") String rolemessage,@Param("role1") String role1, @Param("role2") String role2,@Param("role3") String role3,@Param("role4") String role4);

    @Delete("delete from roles where id = #{id}")
    boolean deleteRoles(@Param("id") int id);
}
