package com.docappointment.project.controller;


import com.docappointment.project.dao.AppointmentDao;
import com.docappointment.project.dao.DoctorDao;
import com.docappointment.project.entity.Appointment;
import com.docappointment.project.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/v1/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentDao appointmentDao;

	@PostMapping
	public boolean appointment(@RequestBody Appointment appointment) {
		return appointmentDao.save(appointment);
	}

	@GetMapping
	public List<Appointment> appointment() {
		return appointmentDao.findAll();
	}
}
