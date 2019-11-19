import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.List;

public class Course {

    private String name;
    private List<Module> modules;
    private List<Student> students;

    public Course(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public DateTime getAcademicStart() {

        LocalDate currentDate = LocalDate.now();
        DateTime endDate = new DateTime("2020-06-20");
        return endDate;
    }

    public String toString() {
        return name;
    }
}
