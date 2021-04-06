package com.example.springEmployeeTracker;

import com.example.springEmployeeTracker.Models.Department;
import com.example.springEmployeeTracker.Models.Employee;
import com.example.springEmployeeTracker.Models.Project;
import com.example.springEmployeeTracker.Repositories.DepartmentRepository;
import com.example.springEmployeeTracker.Repositories.EmployeeRepository;
import com.example.springEmployeeTracker.Repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringEmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployeeAndDepartment() {
		Department sales = new Department("Sales");
		departmentRepository.save(sales);

		Employee bob = new Employee("Bob", 30, 123, "bob@gmail.com", sales);
		employeeRepository.save(bob);
	}

	@Test
	public void addEmployeesandProjects() {
		Department sales = new Department("Sales");
		departmentRepository.save(sales);

		Employee bob = new Employee("Bob", 30, 123, "bob@gmail.com", sales);
		employeeRepository.save(bob);

		Project project1 = new Project("Sell a Car", 1);
		projectRepository.save(project1);

		project1.addEmployee(bob);
		projectRepository.save(project1);

	}
}
