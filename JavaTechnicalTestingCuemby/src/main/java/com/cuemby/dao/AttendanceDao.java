package com.cuemby.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cuemby.entities.Attendance;
import com.cuemby.repository.AttendanceRepository;

@Repository
public class AttendanceDao {
	// Atributtes
	@Autowired
	AttendanceRepository attendanceRepository;

	public AttendanceDao() {
	}

	public String save(Attendance attendance) {
		if (attendanceRepository.save(attendance) != null) {
			return "true";
		}
		return "false";
	}

	public Collection<Attendance> getAllAttendances() {
		Collection<Attendance> attendances = new ArrayList<Attendance>();
		Iterable<Attendance> attendanceIterable = attendanceRepository.findAll();
		Iterator<Attendance> attendanceIterator = attendanceIterable.iterator();
		while (attendanceIterator.hasNext()) {
			attendances.add(attendanceIterator.next());
		}
		return attendances;
	}
}
