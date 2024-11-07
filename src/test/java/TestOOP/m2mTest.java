package TestOOP;

import OOP.Course.Course;
import OOP.Course.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class m2mTest {

    private static Course course1;
    private static Course course2;
    private static Course course3;

    private static Student student1;
    private static Student student2;
    private static Student student3;

    @BeforeAll
    public static void setUp() {
        course1 = new Course("OOP");
        course2 = new Course("QA");
        course3 = new Course("JavaCore");

        student1 = new Student("J.Silver");
        student2 = new Student("A.Hopkins");
        student3 = new Student("J.Depp");
    }

    @Test
    public void testAddStudent() {
        course1.addStudents(student1, student2, student3);
        assertEquals(3, course1.getLessonsList().size());
    }

}
