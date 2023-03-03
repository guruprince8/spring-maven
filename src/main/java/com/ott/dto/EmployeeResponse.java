package com.ott.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.ott.entity.Blog;
import com.ott.entity.Employee;
// import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Component
@Scope("prototype")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class EmployeeResponse implements Serializable {

     private List<Employee> employees;

    private Employee employee;

    private Collection<Blog> blogs;
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Collection<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(Collection<Blog> blogs) {
        this.blogs = blogs;
    }
}
