import static org.junit.jupiter.api.Assertions.assertEquals;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StudentTest {

    private Student student;

    @Test
    void testGetUsername() {
        String username = student.getUsername();
        assertEquals(username, "Evan22");
    }

    @Test
    void testGetId() {
        String id = student.getId();
        assertEquals(id, "123456");
    }

    @Test
    void testDOB() {
        LocalDate dob = student.getDOB();
        assertEquals(dob, new LocalDate(1997,6,5));
    }

    @Test
    void testGetModules() {
        List<Module> modules = new ArrayList<Module>();
        modules.add(new Module("AI", "CT421"));
        modules.add(new Module("Machine Learning", "CT4101"));

        List<Module> m = student.getModules();

        assertEquals(modules.toString(), m.toString());
    }

    @Test
    void testGetCourses() {
        List<Course> studentCourses = new ArrayList<Course>();
        studentCourses.add(new Course("BCT", new LocalDate(2016, 8, 31), new LocalDate(2020, 5, 15)));

        List<Course> c = student.getCourses();

        assertEquals(studentCourses.toString(), c.toString());
    }

    @BeforeEach
    void testSetup() {
        student = new Student("Evan", new LocalDate(1997, 6, 5), "123456");

        Module ai = new Module("AI", "CT421");
        Module ml = new Module("Machine Learning", "CT4101");
        student.addModule(ai);
        student.addModule(ml);

        Course course = new Course("BCT", new LocalDate(2016, 8, 31), new LocalDate(2020, 5, 15));
        student.addCourse(course);
    }

}