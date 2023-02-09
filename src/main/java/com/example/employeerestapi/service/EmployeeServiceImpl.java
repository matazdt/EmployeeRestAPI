package com.example.employeerestapi.service;

import com.example.employeerestapi.model.Employee;
import com.example.employeerestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    public EmployeeRepository eRepo;


    @Override
    public Employee postEmployee(Employee employee) {
      return eRepo.save(employee);
    }

    @Override
    public List<Employee> retrieveEmployees(){
        return eRepo.findAll();
    }
}
