package com.docappointment.project;


import java.util.List;

import com.docappointment.project.dao.DoctorDao;
import com.docappointment.project.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/v1/doctors")
public class DoctorsController {

	@Autowired
	private DoctorDao doctorDao;

	@PostMapping
	public boolean doctors(@RequestBody Doctor doctor) {
		return doctorDao.saveDoctors(doctor);
	}

	@GetMapping
	public List<Doctor> doctors() {
		return doctorDao.findAll();
	}
}
