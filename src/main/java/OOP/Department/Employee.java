package OOP.Department;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
    private String fullName;
    private String position;
    private Department department;

    public Employee(String fullName, String position) {
        this.fullName = fullName;
        this.position = position;
    }

    /*@Override
    public String toString() {
        return "Full name: "
                + fullName
                + ".\nPosition: "
                + position
                + ".\nDepartment: "
                + department.getTitle()
                + "\n\n";
    }*/
}
