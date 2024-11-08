package OOP.Course;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CourseMember {

    private Student student;
    private List<Course> courseList;
    private LocalDate dateOfStart;
    private LocalDate dateOfEnd;

    public CourseMember(Student student, Course course, String dateOfStart) {
        this.student = student;
        courseList = new ArrayList<>();
        addCourse(course);
        this.dateOfStart = LocalDate.parse(dateOfStart);
    }
    @Override
    public String toString() {
        return "Student:\n"
                + student.toString()
                + "List of courses:\n"
                + courseList.stream().toString();
    }

    public String viewCourse() {
        String courseStart = "Course start " + courseList.stream().toString() + "on: " + dateOfStart.toString();
        String courseEnd = courseStart + ".\nEnded course " + courseList.stream().toString() + "on " + dateOfEnd;
        return  (dateOfEnd == null) ? courseStart : courseEnd;
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }
}
