package com.jjj.boot.mapper;

import com.jjj.boot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @className: com.jjj.boot.mapper.MyMapper
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-07 11:57
 */
@Mapper
public interface UserMapper {
    List<User> selectAllUser();

    @Select("select * from user where id = 1")
    User selectById();
}
