package com.xworkz.assignment36.app.services;

import com.xworkz.assignment36.app.repositary.TrainNoRepositary;

public class TrainNoserviceImpl implements TrainNoservice {

	private TrainNoRepositary trainNoRepositary;

	public TrainNoserviceImpl(TrainNoRepositary trainNoRepositary) {
		super();
		this.trainNoRepositary = trainNoRepositary;
	}

	@Override
	public boolean trainNoValidate(long trainNumber) {
		if (trainNumber != 0 && trainNumber > 10000 && trainNumber < 99999) {
			if (!this.trainNoRepositary.isExists(trainNumber)) {
				this.trainNoRepositary.storeTrainNo(trainNumber);
				return true;
			} else {
				System.err.println("Train number already exists..");
			}
		} else {
			System.err.println("Train number is in-valid");
		}
		return false;
	}

}
