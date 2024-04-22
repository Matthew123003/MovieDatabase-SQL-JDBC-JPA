package io.zipcoder.persistenceapp;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PersonService {

    private JdbcTemplate jdbcTemplate;

    public PersonService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addPerson(Person person) {
        String sql = "INSERT INTO person (fName, lName, bDate, mobileNumber) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, person.getFName(), person.getLName(), person.getBDate(), person.getMobileNumber());
    }

    public int updatePerson(Person person) {
        String sql = "UPDATE person SET fName = ?, lName = ?, bDate = ?, mobileNumber = ? WHERE id = ?";
        return jdbcTemplate.update(sql, person.getFName(), person.getLName(), person.getBDate(), person.getMobileNumber(), person.getId());
    }

}
