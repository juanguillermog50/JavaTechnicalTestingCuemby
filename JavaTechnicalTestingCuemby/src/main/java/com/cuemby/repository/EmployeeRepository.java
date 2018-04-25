package com.cuemby.repository;

import org.springframework.data.repository.CrudRepository;

import com.cuemby.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
