package com.arturfrimu.tiktik.service;

import com.arturfrimu.tiktik.dto.EmployeeDto;
import com.arturfrimu.tiktik.mapper.EmployeeMapper;
import com.arturfrimu.tiktik.mapper.Mapper;
import com.arturfrimu.tiktik.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final Mapper employeeMapper;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    @Override
    public List<EmployeeDto> getEmployees() {
        return employeeMapper.toDto(employeeRepository.findAll());
    }
}
