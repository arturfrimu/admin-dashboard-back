package com.arturfrimu.tiktik.mapper;

import com.arturfrimu.tiktik.dto.EmployeeDto;
import com.arturfrimu.tiktik.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeMapper implements Mapper<Employee, EmployeeDto> {
    @Override
    public Employee toEntity(EmployeeDto employeeDto) {
        return new Employee(employeeDto);
    }

    @Override
    public List<Employee> toEntity(List<EmployeeDto> employeeDtos) {
        return employeeDtos.stream().map(employeeDto -> toEntity(employeeDto)).collect(Collectors.toList());
    }

    @Override
    public EmployeeDto toDto(Employee employee) {
        return new EmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> toDto(List<Employee> employees) {
        return employees.stream().map(employee -> toDto(employee)).collect(Collectors.toList());
    }
}
