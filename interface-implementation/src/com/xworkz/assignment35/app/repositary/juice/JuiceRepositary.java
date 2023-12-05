package com.xworkz.assignment35.app.repositary.juice;

public interface JuiceRepositary {

	int TOTAL_ITEMS = 10;

	void store(String juice);

	default boolean isExist(String juice) {
		return false;

	}
}
