package kz.itstep.springboottest.repository.impl;

import kz.itstep.springboottest.model.Student;
import kz.itstep.springboottest.repository.StudentRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentRepositoryImpl implements StudentRepository {

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public List<Student> getAll() {
        return null;
    }
}
