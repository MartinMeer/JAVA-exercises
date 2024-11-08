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
    private List<Course> course = new ArrayList<>(5);
    private LocalDate dateOfStart;
    private LocalDate dateOfEnd;

    public CourseMember(Student student, Course course, String dateOfStart) {
        this.student = student;
        this.course.add(course);
        this.dateOfStart = LocalDate.parse(dateOfStart);
    }
    @Override
    public String toString() {
        return "Student:\n"
                + student.toString()
                + "List of courses:\n"
                + course.stream().toString();
    }

    public String viewCourse() {
        String courseStart = "Course start " + course.stream().toString() + "on: " + dateOfStart.toString();
        String courseEnd = courseStart + ".\nEnded course " + course.stream().toString() + "on " + dateOfEnd;
        return  (dateOfEnd == null) ? courseStart : courseEnd;
    }
}
