package OOP;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Course {
    private String courseName;
    private List<Lesson> coursesList;

    /*public Course(String courseName) {
        this.courseName = courseName;
        coursesList = new ArrayList<>();
    }*/

    @Override
    public String toString() {
        return "Course Name: "
        + courseName
        + ". List of lessons: "
        + coursesList.toString();
    }
}
