package TestOOP.DepartmentTest;

import OOP.Department.Department;
import OOP.Department.Employee;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DepartmentTestHexlet {
    @Test
    public void testDepartment() {

        var department = new Department("it");
        var employee1 = new Employee("Jack Jones", "developer");
        var employee2 = new Employee("John Smith", "qa");
        department.addEmployee(employee1);
        department.addEmployee(employee2);

        assertThat(department.getEmployees()).hasSize(2);
        assertThat(department.getEmployees()).contains(employee1);
        assertThat(department.getEmployees()).contains(employee2);
        assertThat(employee1.getDepartment()).isEqualTo(department);
        assertThat(employee2.getDepartment()).isEqualTo(department);

        department.removeEmployee(employee2);

        assertThat(department.getEmployees()).contains(employee1);
        assertThat(department.getEmployees()).doesNotContain(employee2);
        assertThat(employee1.getDepartment()).isEqualTo(department);
        assertThat(employee2.getDepartment()).isEqualTo(null);
    }
}
