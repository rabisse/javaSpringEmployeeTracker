package com.example.springEmployeeTracker.Repositories;


import com.example.springEmployeeTracker.Models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
