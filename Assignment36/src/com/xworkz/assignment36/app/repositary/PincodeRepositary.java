package com.xworkz.assignment36.app.repositary;

public interface PincodeRepositary {

	int TOTAL_NO_OF_CODES = 5;

	void pincodeStore(long code);

	default boolean isExist(long code) {
		return false;
	}
}
