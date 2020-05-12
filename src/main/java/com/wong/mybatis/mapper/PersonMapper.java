package com.wong.mybatis.mapper;

import com.wong.mybatis.bean.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonMapper {
    // 增加
    @Insert("insert into person(id,name,age) values(#{id},#{name},#{age})")
    int insert(Person person);
    // 删除
    @Delete("delete from person where id = #{id}")
    int deleteByPrimaryKey(Integer id);
    // 修改
    @Update("update person set name = #{name},age = #{age} where id = #{id}")
    int updateByPrimaryKey(Person person);
    // 查询
    @Select("select id,name,age from person where id=#{id}")
    Person selectByPrimaryKey(Integer id);
    @Select("select id,name,age from person")
    List<Person> selectAllPerson();
}
