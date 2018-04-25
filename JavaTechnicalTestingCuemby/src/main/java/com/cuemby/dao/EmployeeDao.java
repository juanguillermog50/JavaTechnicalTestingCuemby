package com.cuemby.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cuemby.entities.Employee;
import com.cuemby.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	// Atributtes
	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeDao() {
	}

	public String save(Employee employee) {
		try {
			if (employeeRepository.save(employee) != null) {
				return "The employee has been saved ";
			}
			return "The employee could not be saved";
		} catch (Exception e) {
			return e.getMessage();
		}

	}

	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).get();
	}

	public boolean exist(int id) {
		if (employeeRepository.existsById(id)) {
			return true;
		} else {
			return false;
		}
	}

	public Collection<Employee> getAllEmployees() {
		Collection<Employee> employees = new ArrayList<Employee>();
		Iterable<Employee> employeesIterable = employeeRepository.findAll();
		Iterator<Employee> employeesIterator = employeesIterable.iterator();
		while (employeesIterator.hasNext()) {
			employees.add(employeesIterator.next());
		}
		return employees;
	}

}
