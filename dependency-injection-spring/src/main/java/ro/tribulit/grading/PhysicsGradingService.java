package ro.tribulit.grading;

import org.springframework.beans.factory.annotation.Autowired;
import ro.tribulit.model.Discipline;
import ro.tribulit.model.Student;
import ro.tribulit.repository.StudentRepository;

public class PhysicsGradingService implements GradingService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void gradeStudent(Student student) {
        Object physicsInfo = studentRepository.getStudentInfo(student, Discipline.PHYSICS);
        // student physics grading logic
        studentRepository.saveStudentGrade(10, student, Discipline.PHYSICS);
    }
}