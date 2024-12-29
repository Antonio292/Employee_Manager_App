package com.employee_manager_app;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
@Getter
@Slf4j
public class Department {
    private String name;
    ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(String employeeId) {
        for (Employee employee: employees) {
            if (employee.getId().equals(employeeId)){
                employees.remove(employee);
            }
        }
    }

    public Employee findEmployee(String employeeId) {
        Employee employee1 = null;
        for (Employee employee: employees) {
            if (employee.getId().equals(employeeId)) {
                employee1 = employee;
                log.info("Employee was founded");
            }
        }
        return employee1;
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        for (Employee employee: employees) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;
    }

    public void getEmployees() {
        for (Employee employee: employees) {
            employee.toString();
            log.info("toString!");
        }
    }
}
