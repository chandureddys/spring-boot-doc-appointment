package com.docappointment.project.controller;

import com.docappointment.project.dao.HospitalDao;
import com.docappointment.project.entity.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/hospitals")
public class HospitalsController {

    @Autowired
    private HospitalDao hospitalDao;

   @PostMapping
    public boolean hospital(@RequestBody Hospital hospital) {
        return  hospitalDao.save(hospital);
    }

    @GetMapping
    public List<Hospital> hospital() {
        return  hospitalDao.findAll();
    }
}
