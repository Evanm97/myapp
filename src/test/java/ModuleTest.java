import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuleTest {

    private Module module;

    @Test
    void testGetName() {
        String name = module.getName();
        assertEquals(name, "SE");
    }

    @Test
    void testGetId() {
        String id = module.getId();
        assertEquals(id, "CT417");
    }

    @Test
    void testGetStudents() {
       List<Student> students = module.getStudents();
        assertEquals(students, null);
    }

    @Test
    void testGetAssociatedCourses() {
        List<Course> associatedCourses = module.getAssociatedCourse();
        assertEquals(associatedCourses, null);
    }

    @BeforeEach
    void testSetup() {
        module = new Module("SE", "CT417");
    }

}
