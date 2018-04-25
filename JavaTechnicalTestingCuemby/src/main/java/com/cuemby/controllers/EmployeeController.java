package com.cuemby.controllers;

import java.io.IOException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cuemby.entities.Employee;
import com.cuemby.service.EmployeeService;


@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
	public String insertEmployee(@RequestBody Employee employee) throws IOException {
		return employeeService.insert(employee);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Employee getEmployeeId(@PathVariable("id") int id) {
		return employeeService.getEmployeeById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Employee> getAllEmployes() {
		return employeeService.getAllEmployees();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody String deactivateEmployee(@PathVariable int id) {
		return employeeService.deactivate(id);
	}
}
