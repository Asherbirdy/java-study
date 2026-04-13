package com.example.demo;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {


    @Override
    public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Student student = new Student();
        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));

        return student;
    }
}
