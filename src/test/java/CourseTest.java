import org.joda.time.LocalDate;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class CourseTest {

    private Course course;
    private List<Student> students = new ArrayList<Student>();
    private ArrayList<Module> modules = new ArrayList<Module>();

    @Test
    public void testGetName() {
        testSetup();
        String name = course.getName();

        assertEquals("BCT", name);
    }

    @Test
    public void testAcademicDates() {
        testSetup();
        LocalDate startDate = course.getAcademicStart();
        LocalDate endDate = course.getAcademicEnd();

        assertEquals(new LocalDate(2016, 8, 31), startDate);
        assertEquals(new LocalDate(2020, 5, 15), endDate);
    }

    @Test
    public void testGetRegisteredStudents() {
        testSetup();
        students.add(new Student("Evan", new LocalDate(1995, 8, 31), 123456));
        List reqStudents = course.getRegisteredStudents();

        assertEquals(reqStudents.toString(), students.toString());
    }

    @Test
    public void testGetModules() {
        testSetup();
        modules.add(new Module("SE", "CT417", null, null));
        List courseModules = course.getModules();

        assertEquals(courseModules.toString(), modules.toString());
    }

    void testSetup() {
        course = new Course("BCT", new LocalDate(2016, 8, 31), new LocalDate(2020, 5, 15));
        Student student = new Student("Evan", new LocalDate(1995, 8, 31), 123456);
        Module module = new Module("SE", "CT417", null, null);
        course.addStudent(student);
        course.addModule(module);
    }
}
