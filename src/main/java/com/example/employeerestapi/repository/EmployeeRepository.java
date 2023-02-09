package com.example.employeerestapi.repository;

import com.example.employeerestapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public List<Employee> findAllByFirstName(String firstName);

}
