package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/service")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping("/employeeByCity/{city}")
	public List<Employee> getEmployeeByCity(@PathVariable String city){
		return repository.findByCity(city);
	}
	
	@GetMapping("/employeeByAge/{age}")
	public List<Employee> getEmployeeByAge(@PathVariable int age){
		return repository.findByAge(age);
	}
	
	@GetMapping("/emp-city-age/{city},{age}")
	public List<Employee> getEmployeeByAgeAndCity(@PathVariable String city, 
			@PathVariable int age){
		return repository.findByCityAndAge(city,age);
	}
	
	@GetMapping("/allemployees")
	public List<Employee> getAllEmployees(){
		return repository.findAll();
	}
	
	
}
