package com.docappointment.project;

import com.docappointment.project.dao.HospitalDao;
import com.docappointment.project.dao.PatientDao;
import com.docappointment.project.entity.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1")
public class HospitalsController {

    @Autowired
    private HospitalDao hospitalDao;

    @RequestMapping(method = RequestMethod.POST, path = "/hospitals")
    public boolean saveHospitalsInfo(@RequestBody Hospital hospital) {
        return  hospitalDao.saveHospitalsInfo(hospital);
    }
}
