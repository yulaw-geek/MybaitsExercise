package com.example.jpamybaits.usermapper;

import com.example.jpamybaits.user.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user (username, email, age) VALUES (#{username}, #{email}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(User user);

    @Select("select * FROM user WHERE id = #{id}")
    User findById(@Param("id") Long id);

    @Delete("DELETE FROM user WHERE id = #{id}")
    int deleteById(@Param("id") Long id);
}
