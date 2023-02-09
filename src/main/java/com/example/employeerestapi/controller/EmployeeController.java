package com.example.employeerestapi.controller;

import com.example.employeerestapi.model.Employee;
import com.example.employeerestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    EmployeeService eService;

    @PostMapping("postEmployee")
    public Employee postEmployee(@RequestBody Employee employee){
        return eService.postEmployee(employee);
    }

    @GetMapping("/allEmployees")
    public List<Employee> getEmployees(){
        return eService.retrieveEmployees();
    }

    @GetMapping("/employeeByFirstName")
    public List<Employee> getEmployeeByFirstName(@RequestParam String fname){
        return eService.retrieveEmployeeByName(fname);
    }

    /*@PostMapping("/employees")
    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee){
        return new ResponseEntity<>(eService.saveEmployee(employee), HttpStatus.CREATED);
    }*/
}
