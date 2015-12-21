package ro.tribulit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ro.tribulit.logic.StudentManager;
import ro.tribulit.model.Student;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application-context.xml");
        StudentManager studentManager = (StudentManager) applicationContext.getBean("studentManager");

        Student student = new Student();

        studentManager.gradeMathStudent(student);
        studentManager.gradePhysicsStudent(student);
    }
}
