package com.docappointment.project.dao;

import com.docappointment.project.entity.Hospital;
import com.docappointment.project.entity.Patient;
import com.docappointment.project.repository.HospitalRep;
import com.docappointment.project.repository.PatientRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PatientDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private PatientRep patientRep;

    @Transactional
    public boolean save(Patient patient){
        entityManager.persist(patient);
        return true;
    }

    public List<Patient> findAll(){
        return this.patientRep.findAll();
    }
}
