import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StudentTest {

    private List<Module> moduleList;
    private List<Course> courseList;

    @Test
    void testGetUsername() {
        Student student = new Student("Evan", 22, null, null, null, null);
        String id = student.getUsername();

        assertEquals(id, "Evan22");
    }

    @Test
    void testDOB() {
        Student student = new Student("Evan", 22, "05-06-1997", null, null, null);
        String dob = student.getDOB();

        assertEquals(dob, "05-06-1997");
    }

    @Test
    void testGetModules() {
        List<String> modules = new ArrayList<String>();
        modules.add("AI");
        modules.add("ML");

        Student student = new Student("Evan", 22, null, null, null, modules);
        List<String> studentModules = student.getModules();

        assertEquals(studentModules, modules);
    }

    @Test
    void testGetCourses() {
        Student student = new Student("Evan", 22, null, null, courseList, null);
        List<Course> studentCourses = student.getCourses();

        System.out.println(courseList);

        assertEquals(studentCourses, courseList);
    }

    @BeforeEach
    void testSetup() {
        Module ai = new Module(null, null, null, null);
        Module ml = new Module(null, null, null, null);
        moduleList = new ArrayList<Module>();
        moduleList.add(ai);
        moduleList.add(ml);

        Course bct = new Course("Computer Science");
        courseList = new ArrayList<Course>();
        courseList.add(bct);
    }

}