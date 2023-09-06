package com.xworkz.assignment36.app.repositary;

public class MobileRepositaryImpl implements MobileRepositary {

	private long[] numbers = new long[NO_OF_MOBILES];

	int position;

	@Override
	public void storeMobileNo(long number) {
		if (this.position < NO_OF_MOBILES) {
			this.numbers[position] = number;
			System.out.println(this.numbers[position] + " is at index " + position);
			this.position++;
		}

	}

	@Override
	public boolean isExisis(long number) {
		for (int index = 0; index <= position; index++) {
			long temp = numbers[index];
			if (temp != 0 && temp == number) {
				return true;
			}
		}
		return MobileRepositary.super.isExisis(number);
	}

}
