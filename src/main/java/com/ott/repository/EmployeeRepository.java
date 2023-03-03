package com.ott.repository;

import com.ott.entity.Blog;
import com.ott.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface EmployeeRepository extends JpaRepository<Employee,String> {

    // @Query ( value = "select b from Blog b where b.posted_by=:empId")
    @Query ( value = "select b.content from Blog b, Employee e where b.posted_by=e.emp_id and b.posted_by=:empId")
    Collection<Blog> findBlogsPostedBy(@Param("empId") String empId);
}
