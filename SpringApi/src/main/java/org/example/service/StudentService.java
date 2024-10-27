package org.example.service;

import org.example.entity.Course;
import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
    public void enrollStudentInCourse(Long studentId, Course course) {
        studentRepository.findById(studentId).ifPresent(student -> {
            student.addCourse(course);
            studentRepository.save(student);
        });
}
}

