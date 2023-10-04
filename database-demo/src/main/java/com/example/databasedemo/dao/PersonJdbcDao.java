package com.example.databasedemo.dao;

import com.example.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        return jdbcTemplate.query("SELECT * FROM person", new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM person where id=?", new Object[]{id}, new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person findByName(String name) {
        return jdbcTemplate.queryForObject("SELECT * FROM person where name=?", new Object[]{name}, new BeanPropertyRowMapper<Person>(Person.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM person where id=?", new Object[]{id});
    }

//    public int insert(Person person) {
//        return jdbcTemplate.update("INSERT INTO person " +
//                "(id, name, location, birth_date) " +
//                "VALUES " +
//                "(?, ?, ?, ?),", new Object[]{person.getId(),
//                person.getName(), person.getLocation(), person.getBirthDate()});
//    }
}
