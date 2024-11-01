package OOP;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Lesson {

    private String lessonName;
    private Course course;

    @Override
    public String toString() {
        return this.lessonName
                + ":"
                + this.course.getCourseName();
    }
}
