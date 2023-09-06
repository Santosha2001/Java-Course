package com.xworkz.assignment36.app.repositary;

public class TrainNoRepositaryImpl implements TrainNoRepositary {

	private long[] trainNumbers = new long[NO_OF_TRAINS];
	int position;

	@Override
	public void storeTrainNo(long trainNumber) {
		if (this.position < NO_OF_TRAINS) {
			this.trainNumbers[position] = trainNumber;
			System.out.println(this.trainNumbers[position] + " is at index " + position);
			this.position++;
		} else {
			System.err.println("Train numbers OutOfBound");
		}

	}

	@Override
	public boolean isExists(long trainNumber) {

		for (int index = 0; index <= position; index++) {
			long temp = trainNumbers[index];
			if (temp != 0 && temp == trainNumber) {
				return true;
			}
		}

		return TrainNoRepositary.super.isExists(trainNumber);
	}

}
