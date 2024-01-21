package com.santosh.constructor.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VehicleBean {

	private int id;
	private String vehicleName;
	private String vehicleModel;
	private String vehicleNumber;
	private Engine engine; // vehicle is dependent on Engine object.
}
