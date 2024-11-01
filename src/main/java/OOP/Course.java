package OOP;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Course {
    private String courseName;
    private List coursesList;

    public Course(String courseName) {
        this.courseName = courseName;
        coursesList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Course Name: "
        + courseName
        + ". List of lessons: "
        + coursesList.toString();
    }
}
