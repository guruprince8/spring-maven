package com.ott.controller;

import com.ott.dto.EmployeeResponse;
import com.ott.entity.Blog;
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

    /**
     * get all employees from web.employee table
     * @return
     */
    @GetMapping("/all")
    public ResponseEntity<EmployeeResponse> listAllEmployees(){
        employeeResponse.setEmployees(employeeRepository.findAll());
        return new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.OK);
    }

    /**
     * Retrieves an employee information based on the emp id
     * If no employee found then 404 exception will be written
     * @return
     */
    @GetMapping("/{empId}")
    public ResponseEntity<EmployeeResponse> findEmployeeById(@PathVariable String empId){
        System.out.println(empId);
        Employee employee = employeeRepository.findById(empId).orElseThrow(()->new ResourceNotFoundException("emp id not found with id "+empId));
        employeeResponse.setEmployee(employee);
        return new ResponseEntity<EmployeeResponse>(employeeResponse,HttpStatus.OK);
    }

    /**
     * Fetch all blogs posted based on employee id
     */
    @GetMapping("/{empId}/blogs")
    public ResponseEntity<EmployeeResponse> findBlogsByEmpId(@PathVariable String empId){
       employeeResponse.setBlogs(employeeRepository.findBlogsPostedBy(empId));
        return new ResponseEntity<EmployeeResponse>(employeeResponse,HttpStatus.OK);
    }
}
