package com.cuemby.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuemby.dao.EmployeeDao;
import com.cuemby.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public String insert(Employee employee) {
		if (employee != null) {
			if (!employeeDao.exist(employee.getId())) {

				return employeeDao.save(employee);
			} else {
				return "The employee" + employee.getFirstName() + " " + employee.getLastName() + "with ID: "
						+ employee.getId() + "  already exists.";
			}
		} else {
			return "There is no employee to create.";
		}
	}

	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}

	public Collection<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	public String deactivate(int id) {
		Employee employee = employeeDao.getEmployeeById(id);
		if (employee != null) {
			if (employee.getStatus().equals("active")) {
				employee.setStatus("inactive");
				return employeeDao.save(employee);
			} else {
				return "The employee" + employee.getFirstName() + " " + employee.getLastName() + " with ID: "
						+ employee.getId() + "  already inactive.";
			}
		}
		return "This employee does not exist.";
	}
}
