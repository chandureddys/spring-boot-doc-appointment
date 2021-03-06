package com.docappointment.project.controller;


import java.util.List;

import com.docappointment.project.dao.DoctorDao;
import com.docappointment.project.entity.Doctor;
import com.docappointment.project.repository.DoctorRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/v1/doctors")
public class DoctorsController {

	@Autowired
	private DoctorDao doctorDao;

	@Autowired
	private DoctorRep doctorRep;

	@PostMapping
	public boolean doctors(@RequestBody Doctor doctor) {
		return doctorDao.save(doctor);
	}

	@GetMapping
	public List<Doctor> doctors() {
		return doctorDao.findAll();
	}
}
