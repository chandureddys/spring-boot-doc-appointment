package com.docappointment.project.repository;

import com.docappointment.project.entity.Appointment;
import com.docappointment.project.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRep extends JpaRepository<Appointment, Long> {
}
