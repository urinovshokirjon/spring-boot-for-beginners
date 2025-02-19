package uz.urinov.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<String> findAllStudents() {
        return List.of(
                new Student(
                        "Ali",
                        "Aliyev",
                        31,
                        LocalDate.now(),
                        "ali@gmail.com").toString(),
                new Student(
                        "Vali",
                        "Valiyev",
                        30,
                        LocalDate.now(),
                        "vali@gmail.com").toString()

        );
    }
}
