import java.util.List;

public class Module {

    private String name;
    private String id;
    private List<Student> students;
    private List<Course> associatedCourses;

    public Module(final String name, final String id, final List<Student> students, final List<Course> courses) {
        this.name = name;
        this.id = id;
        this.students = students;
        this.associatedCourses = courses;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getAssociatedCourse() {
        return associatedCourses;
    }

    public String toString() {
        return name + ", " + id + ", " + students + ", " + associatedCourses;
    }
}
