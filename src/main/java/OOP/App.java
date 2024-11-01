package OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class App {


    Course course1 = new Course("OOP");
    Lesson lesson3 = Lesson.builder()
            .lessonName("L3")
            .course(course1)
            .build();


    public void addLessons() {
        course1.setCoursesList(new ArrayList<>(Arrays.asList(new Lesson("L1", course1), new Lesson("L2", course1))));
        course1.getCoursesList().add(lesson3);
    }
    public void delLessons() {
        course1.getCoursesList().remove(0);

    }



}
