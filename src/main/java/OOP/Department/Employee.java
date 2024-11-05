package OOP.Department;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Employee {
    private String fullName;
    private String position;
    private Department department;

    @Override
    public String toString() {
        return "Full name: "
                + fullName
                + ".\nPosition: "
                + position
                + ".\nDepartment: "
                + department.getTitle()
                + "\n\n";
    }
}
