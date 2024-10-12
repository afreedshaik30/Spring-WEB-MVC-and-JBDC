package in.sp.dao;

import in.sp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao
{
    @Autowired  // Using @Autowired for dependency injection
    private JdbcTemplate jdbcTemplate;

    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM students";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
    }

    // RowMapper implementation
//    private static class StudentRowMapper implements RowMapper<Student> {
//        @Override
//        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//            Student student = new Student();
//            student.setId(rs.getInt("id"));
//            student.setName(rs.getString("name"));
//            student.setCourse(rs.getString("course"));
//            return student;
//        }
    }
