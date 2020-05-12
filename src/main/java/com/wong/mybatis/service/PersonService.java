package com.wong.mybatis.service;


import com.wong.mybatis.bean.Person;

import java.util.List;

public interface PersonService {
    // 增加
    int insertPerson(Person person);
    // 删除
    int deletePersonById(Integer id);
    // 修改
    int updatePersonById(Person person);
    // 查询
    Person selectPersonById(Integer id);
    List<Person> selectAllPerson();

}
