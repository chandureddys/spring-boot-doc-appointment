package com.docappointment.project.dao;

import com.docappointment.project.entity.Hospital;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class HospitalDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public boolean saveHospitalsInfo(Hospital hospital) {
        this.entityManager.persist(hospital);
        return true;
    }
}
