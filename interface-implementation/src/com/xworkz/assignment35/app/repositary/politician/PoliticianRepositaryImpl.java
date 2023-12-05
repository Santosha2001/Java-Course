package com.xworkz.assignment35.app.repositary.politician;

public class PoliticianRepositaryImpl implements PoliticianRepositary {

	String[] politicianArray = new String[NO_OF_POLITICIAN];
	int position;

	@Override
	public void politician(String name) {
		if (this.position < NO_OF_POLITICIAN) {
			this.politicianArray[position] = name;
			System.out.println(politicianArray[position] + " is at index " + position);
			this.position++;

		} else {
			System.out.println("ArrayIndexOutOfBoundException");
		}

	}

}
