package com.xworkz.assignment36.app.repositary;

public interface TrainNoRepositary {

	int NO_OF_TRAINS = 5;

	void storeTrainNo(long trainNumber);

	default boolean isExists(long trainNumber) {
		return false;
	}
}
