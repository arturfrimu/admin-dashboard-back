package com.arturfrimu.tiktik.repository;

import com.arturfrimu.tiktik.dto.EmployeeDto;
import com.arturfrimu.tiktik.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    public List<Employee> findAll() {
        return employees;
    }

    private List<Employee> employees = new ArrayList<>();

    {
        employees.add(new Employee(1L, "Miron Vitold", "HR", "01/03/2021", "USA", "Carson", "avatar3"));
        employees.add(new Employee(2L, "Miron Vitold", "HR", "01/04/2021", "USA", "Carson", "avatar3"));
        employees.add(new Employee(3L, "Miron Vitold", "HR", "01/05/2021", "USA", "Carson", "avatar3"));
        employees.add(new Employee(4L, "Miron Vitold", "HR", "01/06/2021", "USA", "Carson", "avatar3"));
        employees.add(new Employee(5L, "Miron Vitold", "HR", "01/07/2021", "USA", "Carson", "avatar3"));
        employees.add(new Employee(6L, "Miron Vitold", "HR", "01/08/2021", "USA", "Carson", "avatar3"));
    }

}