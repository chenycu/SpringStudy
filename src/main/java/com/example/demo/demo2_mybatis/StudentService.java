package com.example.demo.demo2_mybatis;

public interface StudentService {
    int add(Student student);

    int update(Student student);

    int deleteBysno(String sno);

    Student queryStudentBySno(String sno);
}
