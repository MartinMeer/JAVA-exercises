package TestOOP;

import OOP.Course;
import OOP.Lesson;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class o2mTest {

    static Course course1;
    static Lesson lesson1;
    static Lesson lesson2;
    static Lesson lesson3;
    @BeforeAll
    public static void setUp() {
        course1 = new Course("OOP");
        lesson1 = Lesson.builder()
                .lessonName("L1")
                .course(course1)
                .build();
        lesson2 = Lesson.builder()
                .lessonName("L2")
                .course(course1)
                .build();
        lesson3 = Lesson.builder()
                .lessonName("L3")
                .course(course1)
                .build();
    }

    @Test
    public void testAdd() {
        course1.getCoursesList().add(lesson1);
        course1.getCoursesList().add(lesson2);
        course1.getCoursesList().add(lesson3);
        String actual = course1.toString();
        String expected = "Course Name: OOP. List of lessons: [L1:OOP, L2:OOP, L3:OOP]";

        assertEquals(expected, actual);
    }

    @Test
    public void testDeleteLessonFromCourse() {
        course1.getCoursesList().remove(lesson1);
        String actual = course1.toString();
        String expected = "Course Name: OOP. List of lessons: [L2:OOP, L3:OOP]";
        assertEquals(expected, actual);
    }

    @Test
    public void testDeleteCourseFromLesson() {
        lesson1.setCourse(null);
        assertNull(lesson1.getCourse());

    }




}
