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
    private static Student student4;

    private static CourseMember member1;
    private static CourseMember member2;
    private static CourseMember member3;
    private static CourseMember member4;

    @BeforeAll
    public static void setUp() {
        course1 = new Course("OOP");
        course2 = new Course("QA");
        course3 = new Course("JavaCore");

        student1 = new Student("J.Silver");
        student2 = new Student("A.Hopkins");
        student3 = new Student("J.Depp");
        student4 = new Student("D.Finch");

        member1 = new CourseMember(student1, course1, "2023-01-01");
        member2 = new CourseMember(student2, course1, "2024-02-02");
        member3 = new CourseMember(student3, course3, "2023-12-12");
        member4 = new CourseMember(student4, course2, "2024-10-10");
    }

    @Test
    public void testAddMember() {
        assertEquals(2, course1.getMembersList().size());
        assertEquals(1, course3.getMembersList().size());
    }
    @Test
    public void testAddCourseToMember() {
        member4.addCourse(course3);
        assertEquals(2, course3.getMembersList().size());
    }


    @Test
    public void testViewStudentsByCourse() {
        String expected = "";
        String actual = course1.getMembersList().toString();
        assertEquals(expected, actual);

    }

    @Test
    public void testViewCoursesByStudents() {

    }

    @Test
    public void testViewStudentsOnCourseNow() {

    }

    @Test
    public void testViewStudentsOutOfCourse() {

    }

    @Test
    public void testIsStudentsOnCourse() {

    }

}
