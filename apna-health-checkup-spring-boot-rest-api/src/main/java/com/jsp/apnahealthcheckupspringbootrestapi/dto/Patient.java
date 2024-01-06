package com.jsp.apnahealthcheckupspringbootrestapi.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
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
public class Patient {

	@Id
	private int id;
	private String name;
	private String diseasesType;
	private int age;
	
	@ManyToMany(mappedBy = "patients", cascade = CascadeType.ALL)
	private List<Doctor> doctors;
	
	@ManyToOne
	private Hospital hospital;
	
	@ManyToOne
	private Nurse nurse;
}
