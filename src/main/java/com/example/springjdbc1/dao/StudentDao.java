package com.example.springjdbc1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springjdbc1.model.Student;

@Repository
public class StudentDao {
    
    @Autowired
    private JdbcTemplate j;

    public int insertStudent(Student s){
        String sql = "insert into student(sname,scity,spercentage)values(?,?,?)";
        return j.update(sql, new Object[]{s.getSname(),s.getScity(),s.getSpercentage()});
    }
}
