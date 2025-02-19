package uz.urinov.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {

    Student save(Student student);

     List<Student> findAllStudents();

     Student findByEmail(String email);

     Student update(Student student);

     String deleteStudent(String email);
}
