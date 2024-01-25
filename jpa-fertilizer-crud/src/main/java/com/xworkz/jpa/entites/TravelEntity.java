package com.xworkz.jpa.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "travel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelEntity {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "sourceName")
	private String sourceName;

	@Column(name = "destinationName")
	private String destinationName;

	@Column(name = "noOfPeoples")
	private int noOfPeoples;

	@Column(name = "estimatedCost")
	private double estimatedCost;

}
