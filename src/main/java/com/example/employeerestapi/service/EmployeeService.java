package com.example.employeerestapi.service;

import com.example.employeerestapi.model.Employee;
import com.example.employeerestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface EmployeeService {



    Employee postEmployee(Employee employee);

    List<Employee> retrieveEmployees();
}
