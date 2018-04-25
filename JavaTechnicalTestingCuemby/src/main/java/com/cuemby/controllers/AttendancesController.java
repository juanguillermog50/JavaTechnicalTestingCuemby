package com.cuemby.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cuemby.entities.Attendance;
import com.cuemby.service.AttendanceService;

@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping("/attendances")
public class AttendancesController {

	@Autowired
	private AttendanceService attendanceService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String insertAttendance(@RequestBody Attendance attendance) throws IOException {
		return attendanceService.insert(attendance);
	}

	// value="/{init}/{end}",
	@RequestMapping(method = RequestMethod.GET)
	public List<String[]> getAttendanceBetween(@RequestParam("init") String init, @RequestParam("end") String end)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date in = sdf.parse(init);
		Date en = sdf.parse(end);
		return attendanceService.getAllAttendances(in, en);
	}
}
