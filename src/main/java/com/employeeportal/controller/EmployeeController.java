package com.employeeportal.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeeportal.entity.Employee;
import com.employeeportal.repository.IEmployeeRepo;

@RestController
public class EmployeeController {
	
	@Autowired
	public IEmployeeRepo repository;
	
	@PostMapping("/employee")
	public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
		try {
			Employee e = repository.save(employee);
			if(e == null) {
				ResponseEntity.status(404).body("employee not created!");
			}
		}catch (Exception e) {
			return ResponseEntity.status(500).body("server error "+e.toString());
		}
		return 	ResponseEntity.status(200).body("employee created successfully!");
	}
	
	
	@GetMapping("/list")
	public ResponseEntity<Object> getList(@RequestParam("minAge") int minAge,@RequestParam("maxAge") int maxAge, @RequestParam("gender") String gender ){
		List<Employee> list;
		try {
			list = repository.findEmployeeByGenderAge(minAge, maxAge, gender);
			if(list == null) {
				return ResponseEntity.status(404).body("employee not found!");
			}
		}catch (Exception e) {
			return ResponseEntity.status(500).body("server error"+e.toString());
		}
		return ResponseEntity.status(200).body(list);
	}
	
}
