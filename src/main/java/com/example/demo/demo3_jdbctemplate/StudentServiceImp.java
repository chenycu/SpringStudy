package com.example.demo.demo3_jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService1")
public class StudentServiceImp implements StudentService{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Student student) {
        String sql = "insert into student(sno,sname,ssex) value(?,?,?)";

        return jdbcTemplate.update(sql, student.getSno(), student.getName(), student.getSex());
    }

    @Override
    public int update(Student student) {
        String sql = "update student set SNAME = ?, SSEX = ? where SNO = ?";
        return jdbcTemplate.update(sql, student.getName(), student.getSex(), student.getSno());
    }

    @Override
    public int deleteBysno(String sno) {
        String sql = "delete from student where SNO = ?";
        return jdbcTemplate.update(sql, sno);
    }

    @Override
    public Student queryStudentBySno(String sno) {
        String sql = "select * from student where SNO = ?";
        List<Student> query = jdbcTemplate.query(sql, new Object[]{sno}, new StudentMapper());
        if (query != null && query.size() > 0) {
            return query.get(0);
        }
        return null;
    }
}
