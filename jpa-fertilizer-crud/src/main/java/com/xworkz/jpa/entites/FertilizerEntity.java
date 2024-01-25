package com.xworkz.jpa.entites;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fertilizer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findById", query = "select entity from FertilizerEntity entity where entity.id=:ferId")
@NamedQuery(name = "findAll", query = "select entity from FertilizerEntity entity")
public class FertilizerEntity {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "fertilizerName")
	private String fertilizerName;

	@Column(name = "fertilizerBrand")
	private String fertilizerBrand;

	@Column(name = "fertilizerPrice")
	private double fertilizerPrice;

	@Column(name = "manufactureDate")
	private LocalDate manufactureDate;

	@Column(name = "expireDate")
	private LocalDate expireDate;
}
