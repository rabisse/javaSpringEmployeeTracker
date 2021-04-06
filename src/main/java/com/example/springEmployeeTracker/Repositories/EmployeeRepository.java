package com.example.springEmployeeTracker.Repositories;

import com.example.springEmployeeTracker.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
