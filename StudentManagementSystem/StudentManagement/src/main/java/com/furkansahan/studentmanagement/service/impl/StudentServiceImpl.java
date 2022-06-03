package com.furkansahan.studentmanagement.service.impl;

import com.furkansahan.studentmanagement.entity.Student;
import com.furkansahan.studentmanagement.repository.StudentRepository;
import com.furkansahan.studentmanagement.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
         studentRepository.deleteById(id);
    }
}
