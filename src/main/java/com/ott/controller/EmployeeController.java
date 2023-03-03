package com.ott.controller;

import com.ott.dto.EmployeeResponse;
// import com.ott.entity.Blog;
import com.ott.entity.Employee;
import com.ott.exception.ResourceNotFoundException;
import com.ott.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import java.util.List;

@RestController
@RequestMapping("/employee-management/v1")
@SuppressWarnings("unused")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    /**
     * get all employees from web.employee table
     * @return returns the employee response
     */
    @GetMapping("/fetch/all")
    public ResponseEntity<EmployeeResponse> listAllEmployees(){
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setEmployees(employeeRepository.findAll());
        return new ResponseEntity<>(employeeResponse, HttpStatus.OK);
    }

    /**
     * Retrieves an employee information based on the emp id
     * If no employee found then 404 exception will be written
     * @return returns the employee response
     */
    @GetMapping("/fetch/{empId}")
    public ResponseEntity<EmployeeResponse> findEmployeeById(@PathVariable String empId){
        EmployeeResponse employeeResponse = new EmployeeResponse();
        System.out.println(empId);
        Employee employee = employeeRepository.findById(empId).orElseThrow(()->new ResourceNotFoundException("emp id not found with id "+empId));
        employeeResponse.setEmployee(employee);
        return new ResponseEntity<>(employeeResponse,HttpStatus.OK);
    }

    /**
     * Fetch all blogs posted based on employee id
     * @return returns the employee response
     */
    @GetMapping("/{empId}/blogs")
    public ResponseEntity<EmployeeResponse> findBlogsByEmpId(@PathVariable String empId){
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setBlogs(employeeRepository.findBlogsPostedBy(empId));
        return new ResponseEntity<>(employeeResponse,HttpStatus.OK);
    }
}
