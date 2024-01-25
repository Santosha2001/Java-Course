package com.xworkz.jpa.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "disease")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiseaseEntity {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "diseaseName")
	private String diseaseName;

	@Column(name = "diseaseCauseBy")
	private String diseaseCauseBy;

	@Column(name = "diseaseStage")
	private int diseaseStage;

	@Column(name = "diseaseOriginCountry")
	private String diseaseOriginCountry;
}
