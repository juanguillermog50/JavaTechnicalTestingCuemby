package com.cuemby.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuemby.dao.AttendanceDao;
import com.cuemby.entities.Attendance;
import com.cuemby.entities.Employee;

@Service
public class AttendanceService {
	@Autowired
	private AttendanceDao attendanceDao;
	@Autowired
	private EmployeeService employeeService;

	public String insert(Attendance attendance) {
		if (attendance != null) {
			if (!exist(attendance)) {
				Employee employee = employeeService.getEmployeeById(attendance.getId());
				if ((employee.getAdmission().before(attendance.getDate()))) {
					return attendanceDao.save(attendance);
				} else {
					return "No attendance may be before to the date of admission." + "(" + employee.getAdmission()
							+ ")";
				}
			} else {
				return "This attendance had already been.";
			}
		} else {
			return "There is no attendance to enter.";
		}
	}

	public boolean exist(Attendance attendance) {
		if (attendance != null) {
			Collection<Attendance> attendances = attendanceDao.getAllAttendances();
			for (Attendance att : attendances) {
				if ((attendance.getId() == att.getId()) && (attendance.getDate().equals(att.getDate()))) {
					return true;
				}
			}
		}
		return false;
	}

	public List<String[]> getAllAttendances(Date init, Date end) {
		List<String[]> attendances = new ArrayList<String[]>();
		for (Attendance value : attendanceDao.getAllAttendances()) {
			if ((value.getDate().before(end)) && (value.getDate().after(init))) {
				Employee employee = employeeService.getEmployeeById(value.getId());
				if (employee.getStatus().equals("active")) {
					String[] report = new String[5];
					SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
					report[0] = sdf.format(value.getDate());
					report[1] = employee.getId() + "";
					report[2] = employee.getFirstName();
					report[3] = employee.getLastName();
					report[4] = employee.getPosition();
					attendances.add(report);
				}
			}
		}
		return attendances;
	}

}
