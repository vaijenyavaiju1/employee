// Write your code here
package com.example.employee;

import java.util.*;

public interface EmployeeRepository {
    ArrayList<Employee> getEmployees();

    Employee getEmployeeById(int employeeId);

    Employee addEmployee(Employee employee);

    Employee updatedEmployee(int employeeId, Employee employee);

    void deleteEmployee(int employeeId);
}
