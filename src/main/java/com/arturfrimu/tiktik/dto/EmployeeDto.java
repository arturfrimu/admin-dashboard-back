package com.arturfrimu.tiktik.dto;

import com.arturfrimu.tiktik.model.Employee;

public class EmployeeDto {
    public Long id;
    public String name;
    public String title;
    public String hireDate;
    public String country;
    public String reportsTo;
    public String employeeImage;

    public EmployeeDto(Long id, String name, String title, String hireDate, String country, String reportsTo, String employeeImage) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.hireDate = hireDate;
        this.country = country;
        this.reportsTo = reportsTo;
        this.employeeImage = employeeImage;
    }

    public EmployeeDto(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.title = employee.getTitle();
        this.hireDate = employee.getHireDate();
        this.country = employee.getCountry();
        this.reportsTo = employee.getReportsTo();
        this.employeeImage = employee.getEmployeeImage();
    }
}
