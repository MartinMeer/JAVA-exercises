package CourseTest;

import OOP.Course.Course;
import OOP.Course.CourseMember;
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

    private static CourseMember member1;
    private static CourseMember member2;
    private static CourseMember member3;

    @BeforeAll
    public static void setUp() {
        course1 = new Course("OOP");
        course2 = new Course("QA");
        course3 = new Course("JavaCore");

        student1 = new Student("J.Silver");
        student2 = new Student("A.Hopkins");
        student3 = new Student("J.Depp");

        member1 = new CourseMember(student1, course1, "01.01.2003" );
        member2 = new CourseMember(student2, course1, "15.02.2003");
        member3 = new CourseMember(student3, course3, "20.03.2003");
    }

    @Test
    public void testAddMember() {
        assertEquals(2, course1.getMembersList().size());
        assertEquals(1, course3.getMembersList().size());
    }

    @Test
    public void testViewStudentFromCourse() {

    }

}
