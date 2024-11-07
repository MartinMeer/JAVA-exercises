package OOP.Course;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Course {
    private String courseName;
    private List<Lesson> lessonsList;
    private List<Student> studentsList;

    public Course(String courseName) {
        this.courseName = courseName;
        lessonsList = new ArrayList<>();
        studentsList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Course Name: "
        + courseName
        + ". List of lessons: "
        + lessonsList.toString();
    }
}
