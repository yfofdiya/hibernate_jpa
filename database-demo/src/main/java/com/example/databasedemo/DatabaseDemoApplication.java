package com.example.databasedemo;

import com.example.databasedemo.dao.PersonJdbcDao;
import com.example.databasedemo.dao.PersonJpaDao;
import com.example.databasedemo.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@Slf4j
public class DatabaseDemoApplication implements CommandLineRunner {

    @Autowired
    PersonJdbcDao personJdbcDao;

    @Autowired
    PersonJpaDao personJpaDao;

    public static void main(String[] args) {
        SpringApplication.run(DatabaseDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        log.info("All Persons -> {}", personJdbcDao.findAll());
//        log.info("Person with id 10001 is -> {}", personJdbcDao.findById(10001));
//        log.info("Person with name Yash1 is -> {}", personJdbcDao.findByName("Yash"));
//        log.info("Deleting person with id 10002 -> Deleted row count are {}", personJdbcDao.deleteById(10002));
//        log.info("Inserting a row -> Inserted row count is {}", personJdbcDao.insert(new Person(10003, "Yash2", "Kutch", new Date())));
        log.info("Person with id 10001 is -> {}", personJpaDao.findById(10001));
        log.info("Inserting a row -> Inserted row count is {}", personJpaDao.insert(new Person("Yash2", "Kutch", new Date())));
        personJpaDao.deleteById(1);
        log.info("All Persons -> {}", personJpaDao.findAll());
    }
}
