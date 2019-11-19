import org.joda.time.DateTime;

import java.util.List;

public class Student {

    private String name;
    private int age;
    private String dob;
    private List<String> modules;
    private List<Course> courses;

    public Student(final String name, final int age, String dob, String id, List<Course> courses, List<String> modules) {
        this.name = name;
        this.age = age;
        this.modules = modules;
        this.dob = dob;
        this.courses = courses;
    }

    public String getUsername() {
        return name + age;
    }

    public List<String> getModules() {
        return modules;
    }

    public String getDOB () {
        return dob;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
