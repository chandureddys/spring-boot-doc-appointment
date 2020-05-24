package com.docappointment.project.dao;

import com.docappointment.project.entity.Doctor;
import com.docappointment.project.repository.DoctorRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DoctorDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private DoctorRep doctorRep;

    @Transactional
    public boolean save(Doctor doctor) {
        this.entityManager.persist(doctor);
        return true;
    }

    public List<Doctor> findAll(){
        return this.doctorRep.findAll();
    }
}
