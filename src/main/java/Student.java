import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private LocalDate dob;
    private int id;
    private int age;
    private List<Module> modules = new ArrayList<Module>();
    private List<Course> courses = new ArrayList<Course>();

    public Student(final String name, LocalDate dob, int id) {
        this.name = name;
        this.dob = dob;
        this.id = id;
        this.age = getAge();
    }

    int getAge() {
        return Years.yearsBetween(dob, new LocalDate()).getYears();
    }

    public String getUsername() {
        return name + age;
    }

    int getId() {
        return id;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public List<Module> getModules() {
        return modules;
    }

    public LocalDate getDOB () {
        return dob;
    }

    void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String toString() {
        return name + " " + dob + " " + id + " " + courses + " " + modules;
    }
}
