package in.sp.controller;

import in.sp.entity.Student;
import in.sp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController
{
    @GetMapping("/addStudentPage")
    public String openAddStudentPage()
    {
        return "addStudentPage";
    }

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute("stu") Student student)
    {
        studentService.addStudent(student);
        return "redirect:index.jsp";
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Student> studentList = studentService.getAllStudent(); // Fetch the list of students
        model.addAttribute("studentList", studentList); // Add the list to the model
        return "index"; // Return the view name, which is index.jsp
    }


}
