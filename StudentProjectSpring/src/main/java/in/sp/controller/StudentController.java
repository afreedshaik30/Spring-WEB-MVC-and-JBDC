package in.sp.controller;

import in.sp.model.Student;
import in.sp.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController
{
    @Autowired
    private StudentDao studentDao;  // Using @Autowired for dependency injection

    @GetMapping("/students")
    public String getStudents(Model model) {
        List<Student> students = studentDao.getAllStudents();
        model.addAttribute("students", students);
        return "studentList";
    }
}
