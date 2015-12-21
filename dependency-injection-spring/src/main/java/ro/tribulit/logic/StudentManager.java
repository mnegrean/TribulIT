package ro.tribulit.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.tribulit.grading.GradingService;
import ro.tribulit.model.Student;

@Service
public class StudentManager {

    @Autowired
    private GradingService mathGradingService;

    @Autowired
    private GradingService physicsGradingService;

    public StudentManager() {
    }

    public void gradeMathStudent(Student student) {
        // grade student math logic
        mathGradingService.gradeStudent(student);
    }

    public void gradePhysicsStudent(Student student) {
        // grade student physics logic
        physicsGradingService.gradeStudent(student);
    }
}