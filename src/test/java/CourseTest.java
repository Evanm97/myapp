import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {

    @Test
    void testGetName() {
        Course course = new Course("abc");
        String name = course.getName();

        assertEquals("abc", name);
    }

}
