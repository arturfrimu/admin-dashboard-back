package com.arturfrimu.tiktik.model;

import com.arturfrimu.tiktik.dto.EmployeeDto;

public class Employee {
    private Long id;
    private String name;
    private String title;
    private String hireDate;
    private String country;
    private String reportsTo;
    private String employeeImage;

    public Employee(EmployeeDto employeeDto) {
        this.id = employeeDto.id;
        this.name = employeeDto.name;
        this.title = employeeDto.title;
        this.hireDate = employeeDto.hireDate;
        this.country = employeeDto.country;
        this.reportsTo = employeeDto.reportsTo;
        this.employeeImage = employeeDto.employeeImage;
    }

    public Employee(Long id, String name, String title, String hireDate, String country, String reportsTo, String employeeImage) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.hireDate = hireDate;
        this.country = country;
        this.reportsTo = reportsTo;
        this.employeeImage = employeeImage;
    }

    public Employee(String name, String title, String hireDate, String country, String reportsTo, String employeeImage) {
        this.name = name;
        this.title = title;
        this.hireDate = hireDate;
        this.country = country;
        this.reportsTo = reportsTo;
        this.employeeImage = employeeImage;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getCountry() {
        return country;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public String getEmployeeImage() {
        return employeeImage;
    }
}


