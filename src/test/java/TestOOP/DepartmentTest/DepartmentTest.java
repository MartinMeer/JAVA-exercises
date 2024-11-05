package TestOOP.DepartmentTest;
 /*+---------------------+
         |    Department       |
        +---------------------+
        | - title: String     |
        | - employees: List   |
        +---------------------+
        | + addEmployee()     |
        | + removeEmployee()  |
        | + getTitle()        |
        | + setTitle()        |
        | + getEmployees()    |
        +---------------------+
        | 1
        |
        |
        v 0..*
        +--------------------------+
        |        Employee          |
        +--------------------------+
        | - fullName: String       |
        | - position: String       |
        | - department: Department |
        +--------------------------+
        | + getFullName()          |
        | + setFullName()          |
        | + getPosition()          |
        | + setPosition()          |
        | + getDepartment()        |
        | + setDepartment()        |
        +--------------------------+*/

import OOP.Department.Department;
import OOP.Department.Employee;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DepartmentTest {

    private static Department department1;
    private static Employee employee1;
    private static Employee employee2;
    private static Employee employee3;

    @BeforeAll
    public static void setUp() {
        department1 = new Department("IT");
        employee1 = Employee.builder()
                .fullName("J.Depp")
                .position("junior dev")
                .department(department1)
                .build();
        employee2 = Employee.builder()
                .fullName("J.Silver")
                .position("middle dev")
                .department(department1)
                .build();
        employee3 = Employee.builder()
                .fullName("A.Hopkins")
                .position("senior dev")
                .department(department1)
                .build();
        department1.addEmployee(employee1, employee2);
        department1.addEmployee(employee3);

    }

    @Test
    public void addEmployeeTest() {
        int expectedEmployeeListSize = 3;
        int actualEmployeeListSize = department1.getEmployees().size();
        assertEquals(expectedEmployeeListSize, actualEmployeeListSize);
    }

    @Test
    public void printDepartment() {
        String expected = "Department Name: IT.\n" +
                "List of employees:\n" +
                "Full name: J.Depp.\n" +
                "Position: junior dev.\n" +
                "Department: IT\n" +
                "\n" +
                "Full name: J.Silver.\n" +
                "Position: middle dev.\n" +
                "Department: IT\n" +
                "\n" +
                "Full name: A.Hopkins.\n" +
                "Position: senior dev.\n" +
                "Department: IT\n" +
                "\n";
        String actual = department1.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void removeEmployeeTest() {
        Employee employeeForRemove = employee1;
        department1.removeEmployee(employeeForRemove);
        int expectedEmployeeListSize = 2;
        int actualEmployeeListSize = department1.getEmployees().size();
        assertEquals(expectedEmployeeListSize, actualEmployeeListSize);
        var actualEmployeeDepartment = employeeForRemove.getDepartment();
        assertNull(actualEmployeeDepartment);
    }





}
