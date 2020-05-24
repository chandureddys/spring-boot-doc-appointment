package com.docappointment.project.repository;

import com.docappointment.project.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRep extends JpaRepository<Doctor, Long> {
}
