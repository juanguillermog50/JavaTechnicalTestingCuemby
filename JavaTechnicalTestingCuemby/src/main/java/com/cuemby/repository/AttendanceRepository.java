package com.cuemby.repository;

import org.springframework.data.repository.CrudRepository;

import com.cuemby.entities.Attendance;

public interface AttendanceRepository extends CrudRepository<Attendance, Integer> {

}
