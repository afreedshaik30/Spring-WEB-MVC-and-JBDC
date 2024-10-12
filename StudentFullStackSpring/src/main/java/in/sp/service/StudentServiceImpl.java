package in.sp.service;

import in.sp.entity.Student;
import in.sp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService
{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.getAllStudent();
    }

    @Override
    public void addStudent(Student student)
    {
        studentRepository.addStudent(student);
    }

    @Override
    public void updateStudent(Student student)
    {
      studentRepository.updateStudent(student);
    }

    @Override
    public void deleteStudent(int id)
    {
      studentRepository.deleteStudent(id);
    }
}
