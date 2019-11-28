package com.example.demo.demo3_jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/demo3")
public class JdbcController {
    @Autowired
    private StudentServiceImp studentServiceImp;

    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    public int addStudent(String sno, String name, String sex) {
        Student student = new Student();
        student.setSno(sno);
        student.setName(name);
        student.setSex(sex);
        return studentServiceImp.add(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.DELETE)
    public int deleteStudentBySno(String sno) {
        return studentServiceImp.deleteBysno(sno);
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public int updateStudent(String sno, String name, String sex) {
        Student student = new Student();
        student.setSno(sno);
        student.setName(name);
        student.setSex(sex);
        return studentServiceImp.update(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public Student queryStudentBySno(String sno) {
        return studentServiceImp.queryStudentBySno(sno);
    }

    /**
     * 使用jdbcTemplate.queryForList(sql)查询
     * @return List<Map<String, Object>>类型
     */
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Map<String, Object>> queryStudentsListMap() {
        return studentServiceImp.queryStudents();
    }

    /**
     * 使用jdbcTemplate.query(sql, ...)查询
     * @return List<Student>类型
     */
    @RequestMapping(value = "/students/1", method = RequestMethod.GET)
    public List<Student> queryStudentsListMap1() {
        return studentServiceImp.queryStudents1();
    }
}
