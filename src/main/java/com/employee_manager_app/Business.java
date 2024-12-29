package com.employee_manager_app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Business {
    private String name;
    private HashMap<String, Department> departments = new HashMap<>();

    public Business(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        departments.put(department.getName(), department);
    }

    public void removeDepartment(String departmentName) {
        departments.remove(departmentName);
    }

    public Department getDepartment(String departmentName) {
        return departments.get(departmentName);
    }

    public HashSet<String> getAllPositions() {
        HashSet<String> positions = new HashSet<>();
        for (Map.Entry<String, Department> depart: departments.entrySet()) {
            for (Employee employee: depart.getValue().employees) {
                positions.add(employee.getPosition());
            }
        }
        return positions;
    }

    public double getTotalCompanySalary() {
        double totalCompanySalary =0;
        for (Map.Entry<String, Department> depart: departments.entrySet()) {
            for (Employee employee: depart.getValue().employees) {
                totalCompanySalary = totalCompanySalary + employee.getSalary();
            }
        }
        return totalCompanySalary;
    }

}
