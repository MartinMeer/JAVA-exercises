package OOP.Course;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Student {
    private String fullName;
    private List<Course> course;
    private List<CourseMember> memberOf;


    public Student(String fullName) {
        this.fullName = fullName;
        course = new ArrayList<>();
        memberOf = new ArrayList<>();
    }

    @Override
    public String toString() {
       return "Student's full name:\n" + fullName;
    }
}
