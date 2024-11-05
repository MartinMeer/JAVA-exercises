package OOP.Department;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Setter
@Getter
public class Department {
    private String title;
    private List<Employee> employees;

    public Department(String title) {
        this.title = title;
        employees = new ArrayList();
    }

    public void addEmployee(Employee... employee) {
        Arrays.stream(employee).forEach(e -> {
            employees.add(e);
            e.setDepartment(this);
        });
    }

    public void removeEmployee(Employee employeeForRemove) {
        int indexOfRemovedEmployee = employees.indexOf(employeeForRemove);
        Employee removedEmployee = employees.get(indexOfRemovedEmployee);
        removedEmployee.setDepartment(null);
        employees.remove(indexOfRemovedEmployee);
    }

   /* @Override
    public String toString() {
        StringBuilder listOfEmployees = new StringBuilder();
        employees.stream().forEach(listOfEmployees::append);
        return "Department Name: "
                + title
                + ".\nList of employees:\n"
                + listOfEmployees;
    }*/
}
