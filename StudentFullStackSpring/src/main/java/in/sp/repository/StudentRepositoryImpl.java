package in.sp.repository;

import in.sp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> getAllStudent()
    {
        String query="SELECT * FROM studentproject";
        return jdbcTemplate.query(query,new BeanPropertyRowMapper<>(Student.class));
    }

    @Override
    public void addStudent(Student student)
    {
        String query = "INSERT INTO studentproject (id, name, marks, branch) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(query, student.getId(), student.getName(), student.getMarks(), student.getBranch());
    }

    @Override
    public void updateStudent(Student student)
    {
       String query="UPDATE studentproject SET name = ?, marks = ?, branch = ? WHERE id = ?";
       jdbcTemplate.update(query,student.getName(),student.getMarks(),student.getBranch(),student.getId());
    }

    @Override
    public void deleteStudent(int id)
    {
       String query="DELETE FROM studentproject WHERE id = ?";
       jdbcTemplate.update(query, id);
    }
}
