import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private LocalDate academicStart;
    private LocalDate academicEnd;
    private List<Module> modules = new ArrayList<Module>();
    private List<Student> students = new ArrayList<Student>();

    public Course(final String name, final LocalDate academicStart, final LocalDate academicEnd) {
        this.name = name;
        this.academicStart = academicStart;
        this.academicEnd = academicEnd;

    }

    public String getName() {
        return name;
    }

    public LocalDate getAcademicStart() {
        return academicStart;
    }

    public LocalDate getAcademicEnd() {
        return academicEnd;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public List getModules() {
        return modules;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List getRegisteredStudents() {
        return students;
    }

    public String toString() {
        return name + ", " + academicStart + ", " + academicEnd;
    }
}
