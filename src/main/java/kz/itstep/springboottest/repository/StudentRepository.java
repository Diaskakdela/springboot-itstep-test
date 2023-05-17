package kz.itstep.springboottest.repository;

import kz.itstep.springboottest.model.Student;

import java.util.List;

public interface StudentRepository {
    void addStudent(Student student);
    List<Student> getAll();
}
