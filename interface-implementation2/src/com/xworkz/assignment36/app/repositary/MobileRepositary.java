package com.xworkz.assignment36.app.repositary;

public interface MobileRepositary {

	int NO_OF_MOBILES = 5;

	void storeMobileNo(long number);

	default boolean isExisis(long number) {
		return false;
	}
}
