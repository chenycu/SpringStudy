package com.example.demo.demo3_jdbctemplate;

public interface StudentService {
    int add(Student student);

    int update(Student student);

    int deleteBysno(String sno);

    Student queryStudentBySno(String sno);
}
