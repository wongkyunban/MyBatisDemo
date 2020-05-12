package com.wong.controller;

import com.wong.mybatis.bean.Person;
import com.wong.mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    // add
    @RequestMapping(value = "/add")
    public String addStudents(){
        Person student = new Person();
        student.setName("Tom");
        student.setAge(12);
        int rs = personService.insertPerson(student);
        return "插入结果："+rs;
    }

    // select
    @RequestMapping(value = "/findAll")
    public String findAllStudents(){
        List<Person> students = personService.selectAllPerson();
        students.stream().forEach(System.out::println);
        return students.toString()+"";
    }


}
