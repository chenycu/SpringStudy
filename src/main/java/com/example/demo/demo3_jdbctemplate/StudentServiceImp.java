package com.example.demo.demo3_jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service("studentService1")
public class StudentServiceImp implements StudentService {
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

    @Override
    public List<Map<String, Object>> queryStudents() {
        String sql = "SELECT * FROM student";
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public List<Student> queryStudents1() {
        String sql = "SELECT * FROM student";
        return jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
            Student student = new Student();
            student.setSno(rs.getString("sno"));
            student.setName(rs.getString("sname"));
            student.setSex(rs.getString("ssex"));
            return student;
        });
    }

    public int test() {
        System.out.println("执行了 test方法");
        return 10;
    }

}
