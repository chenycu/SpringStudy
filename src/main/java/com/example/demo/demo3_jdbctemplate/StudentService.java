package com.example.demo.demo3_jdbctemplate;

import java.util.List;
import java.util.Map;

public interface StudentService {
    int add(Student student);

    int update(Student student);

    int deleteBysno(String sno);

    Student queryStudentBySno(String sno);

    List<Map<String, Object>> queryStudents();

    List<Student> queryStudents1();
}
