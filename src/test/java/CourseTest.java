import org.joda.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseTest {

    private Course course;
    private List<Student> students = new ArrayList<Student>();
    private ArrayList<Module> modules = new ArrayList<Module>();

    @Test
    void testGetName() {
        String name = course.getName();

        assertEquals("BCT", name);
    }

    @Test
    void testAcademicDates() {
        LocalDate startDate = course.getAcademicStart();
        LocalDate endDate = course.getAcademicEnd();

        assertEquals(new LocalDate(2016, 8, 31), startDate);
        assertEquals(new LocalDate(2020, 5, 15), endDate);
    }

    @Test
    void testGetRegisteredStudents() {
        students.add(new Student("Evan", new LocalDate(1995, 8, 31), "123456"));
        List reqStudents = course.getRegisteredStudents();

        assertEquals(reqStudents.toString(), students.toString());
    }

    @Test
    void testGetModules() {
        modules.add(new Module("SE", "CT417"));
        List courseModules = course.getModules();

        assertEquals(courseModules.toString(), modules.toString());
    }

    @BeforeEach
    void testSetup() {
        course = new Course("BCT", new LocalDate(2016, 8, 31), new LocalDate(2020, 5, 15));
        Student student = new Student("Evan", new LocalDate(1995, 8, 31), "123456");
        Module module = new Module("SE", "CT417");
        course.addStudent(student);
        course.addModule(module);
    }
}
