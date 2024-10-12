package in.sp.service;

import in.sp.entity.Student;

import java.util.List;

public interface StudentService
{
    List<Student> getAllStudent();
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int id);
}
