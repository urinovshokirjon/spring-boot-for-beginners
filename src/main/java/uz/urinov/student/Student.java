package uz.urinov.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String firstName;

    private String lastName;

    private int age;

    public LocalDate dateOfBirth;

    public String email;
}
