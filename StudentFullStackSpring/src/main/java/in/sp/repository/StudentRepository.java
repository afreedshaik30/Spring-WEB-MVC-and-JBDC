package in.sp.repository;

import in.sp.entity.Student;

import java.util.List;

public interface StudentRepository
{
    List<Student> getAllStudent();
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int id);
}
