package com.docappointment.project.dao;

import com.docappointment.project.entity.Appointment;
import com.docappointment.project.entity.Patient;
import com.docappointment.project.repository.AppointmentRep;
import com.docappointment.project.repository.PatientRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AppointmentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private AppointmentRep appointmentRep;

    @Transactional
    public boolean save(Appointment appointment){
        entityManager.persist(appointment);
        return true;
    }

    public List<Appointment> findAll(){
        return this.appointmentRep.findAll();
    }
}
