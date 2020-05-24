package com.docappointment.project.repository;

import com.docappointment.project.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRep extends JpaRepository<Patient, Long> {
}
