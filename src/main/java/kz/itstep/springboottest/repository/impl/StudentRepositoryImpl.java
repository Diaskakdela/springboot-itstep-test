package kz.itstep.springboottest.repository.impl;

import kz.itstep.springboottest.data.StudentData;
import kz.itstep.springboottest.exception.StudentException;
import kz.itstep.springboottest.model.Student;
import kz.itstep.springboottest.repository.StudentRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public void addStudent(Student student) {
        if(StudentData.students.stream().anyMatch(s -> s.getId().equals(student.getId()) )){
            throw new StudentException("Student is already exists");
        }
        StudentData.students.add(student);
    }

    @Override
    public List<Student> getAll() {
        return StudentData.students;
    }
}
