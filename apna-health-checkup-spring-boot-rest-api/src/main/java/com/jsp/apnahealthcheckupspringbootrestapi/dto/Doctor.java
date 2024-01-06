package com.jsp.apnahealthcheckupspringbootrestapi.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
	
	@Id
    private int id;
	private String name;
	private String doctorSpecialist;
	
	@ManyToOne
	private Hospital hospital;
	
	@ManyToMany
	private List<Patient> patients;
}
