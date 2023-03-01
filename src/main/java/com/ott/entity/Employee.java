package com.ott.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @JsonProperty(value = "empId")
    private String emp_id;
    @JsonProperty(value = "fullName")
    private String full_name;
    @JsonProperty(value = "jobTitle")
    private String job_title;
    @JsonProperty(value = "department")
    private String department;
    @JsonProperty(value = "businessUnit")
    private String business_unit;
    @JsonProperty(value = "gender")
    private String gender;
    @JsonProperty(value = "ethnicity")
    private String ethnicity;
    @JsonProperty(value = "age")
    private int age;
    @JsonProperty(value = "hireDate")
    private Date hire_date;
    @JsonProperty(value = "annualSalary")
    private Double annual_salary;
    @JsonProperty(value = "bonus")
    private Double bonus;
    @JsonProperty(value = "country")
    private String country;
    @JsonProperty(value = "exitDate")
    private Date exit_date;

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBusiness_unit() {
        return business_unit;
    }

    public void setBusiness_unit(String business_unit) {
        this.business_unit = business_unit;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public Double getAnnual_salary() {
        return annual_salary;
    }

    public void setAnnual_salary(Double annual_salary) {
        this.annual_salary = annual_salary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getExit_date() {
        return exit_date;
    }

    public void setExit_date(Date exit_date) {
        this.exit_date = exit_date;
    }
}
