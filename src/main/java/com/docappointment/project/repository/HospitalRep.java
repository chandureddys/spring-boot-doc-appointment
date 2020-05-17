package com.docappointment.project.repository;

import com.docappointment.project.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRep extends JpaRepository<Hospital, Long> {
}
