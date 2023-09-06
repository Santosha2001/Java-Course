package com.xworkz.assignment36.app.repositary;

public class PincodeRepositaryImpl implements PincodeRepositary {

	private long[] codes = new long[TOTAL_NO_OF_CODES];

	int position;

	@Override
	public void pincodeStore(long code) {
		if (position < TOTAL_NO_OF_CODES) {
			this.codes[position] = code;
			System.out.println(this.codes[position] + " is at index " + position);
			this.position++;
		}

	}

	@Override
	public boolean isExist(long code) {
		for (int index = 0; index <= position; index++) {
			long temp = codes[index];
			if (temp != 0 && temp == code) {
				System.out.println("Code is stored");
				return true;
			}
		}
		return PincodeRepositary.super.isExist(code);
	}

}
