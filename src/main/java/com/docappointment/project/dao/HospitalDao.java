package com.docappointment.project.dao;

import com.docappointment.project.entity.Hospital;
import com.docappointment.project.repository.HospitalRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class HospitalDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private HospitalRep hospitalRep;

    @Transactional
    public boolean save(Hospital hospital) {
        this.entityManager.persist(hospital);
        return true;
    }

    public  List<Hospital> findAll(){
      return this.hospitalRep.findAll();
    }
}
