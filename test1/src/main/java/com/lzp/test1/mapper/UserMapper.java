package com.lzp.test1.mapper;

import com.lzp.test1.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from t_user where name = #{name} and pwd = #{pwd}")
    User login(User u);
}
