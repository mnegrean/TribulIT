package ro.tribulit.grading;

import org.springframework.beans.factory.annotation.Autowired;
import ro.tribulit.model.Discipline;
import ro.tribulit.model.Student;
import ro.tribulit.repository.StudentRepository;

public class MathGradingService implements GradingService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void gradeStudent(Student student) {
        Object mathInfo = studentRepository.getStudentInfo(student, Discipline.MATH);
        // student math grading logic
        studentRepository.saveStudentGrade(10, student, Discipline.MATH);
    }
}