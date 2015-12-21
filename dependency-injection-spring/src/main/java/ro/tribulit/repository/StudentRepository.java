package ro.tribulit.repository;

import org.springframework.stereotype.Repository;
import ro.tribulit.model.Discipline;
import ro.tribulit.model.Student;

@Repository
public class StudentRepository {

    public StudentRepository() {

    }

    public void saveStudentGrade(int grade, Student student, Discipline discipline) {
        // save the grade of the student in the db
        System.out.println(String.format("Saved student grade for %s.", discipline));
    }

    public Object getStudentInfo(Student student, Discipline discipline) {
        // get the student info for the discipline from the db
        return null;
    }
}