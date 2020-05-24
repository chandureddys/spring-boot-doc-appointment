package com.docappointment.project;

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
    public boolean saveHospitalsInfo(@RequestBody Hospital hospital) {
        return  hospitalDao.saveHospitalsInfo(hospital);
    }

    @GetMapping
    public List<Hospital> getHospitals() {
        return  hospitalDao.findAll();
    }
}
