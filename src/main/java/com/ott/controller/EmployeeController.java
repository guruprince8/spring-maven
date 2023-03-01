package com.ott.controller;

import com.ott.dto.EmployeeResponse;
import com.ott.entity.Employee;
import com.ott.exception.ResourceNotFoundException;
import com.ott.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee/v1")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeResponse employeeResponse;

    @GetMapping("/all")
    public ResponseEntity<EmployeeResponse> listAllEmployees(){
        employeeResponse.setEmployees(employeeRepository.findAll());
        return new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.OK);
    }

    @GetMapping("/{empId}")
    public ResponseEntity<EmployeeResponse> findEmployeeById(@PathVariable String empId){
        System.out.println(empId);
        Employee employee = employeeRepository.findById(empId).orElseThrow(()->new ResourceNotFoundException("emp id not found with id "+empId));
        employeeResponse.setEmployee(employee);
        return new ResponseEntity<EmployeeResponse>(employeeResponse,HttpStatus.OK);
    }
}
