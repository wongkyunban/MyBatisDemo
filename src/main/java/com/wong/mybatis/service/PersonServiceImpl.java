package com.wong.mybatis.service;

import com.wong.mybatis.bean.Person;
import com.wong.mybatis.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonMapper personMapper;

    @Override
    public int insertPerson(Person person) {
        return personMapper.insert(person);
    }

    @Override
    public int deletePersonById(Integer id) {
        return personMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updatePersonById(Person person) {
        return personMapper.updateByPrimaryKey(person);
    }

    @Override
    public Person selectPersonById(Integer id) {
        return personMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Person> selectAllPerson() {
        return personMapper.selectAllPerson();
    }
}
