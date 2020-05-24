package com.docappointment.project.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Hospital {

    @Id
    @GeneratedValue
    @Column(name="hospital_id")
    private Long  id;
    private String name;
    private String address;
    private String city;
    private String zipcode;
    private String insurancePlan;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, mappedBy="hospital")
    private Set<Doctor> doctors = new HashSet<Doctor>();

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getInsurancePlan() {
        return insurancePlan;
    }

    public void setInsurancePlan(String insurancePlan) {
        this.insurancePlan = insurancePlan;
    }
}
