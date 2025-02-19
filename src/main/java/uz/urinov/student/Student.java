package uz.urinov.student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;

    private String lastName;

    @Transient
    private int age;

    private LocalDate dateOfBirth;

    @Column(unique = true)
    private String email;

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

}
