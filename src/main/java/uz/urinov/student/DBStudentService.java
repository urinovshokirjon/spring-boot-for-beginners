package uz.urinov.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("db")
public class DBStudentService implements StudentService {

    private final StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }


    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student update(Student student) {
        return repository.save(student);
    }

    @Override
    public String deleteStudent(String email) {
        repository.deleteByEmail(email);
        return "Deleted student with email: " + email;
    }
}
