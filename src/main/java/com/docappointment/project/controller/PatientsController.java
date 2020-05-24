package com.docappointment.project.controller;


import com.docappointment.project.entity.Hospital;
import com.docappointment.project.entity.Patient;
import com.docappointment.project.dao.PatientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/patients")
public class PatientsController {
    @Autowired
    private PatientDao patientDao;

    @PostMapping
    public Boolean patients(@RequestBody Patient patient) {
        return patientDao.save(patient);
    }

    @GetMapping
    public List<Patient> patients() {
        return  patientDao.findAll();
    }
}
