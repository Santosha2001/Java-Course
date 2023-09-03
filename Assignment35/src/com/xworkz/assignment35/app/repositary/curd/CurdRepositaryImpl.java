package com.xworkz.assignment35.app.repositary.curd;

public class CurdRepositaryImpl implements CurdRepositary {

	private String[] crudArray = new String[SIZE];
	private int position;

	@Override
	public void curd(String name) {

		if (this.position < SIZE) {
			this.crudArray[position] = name;
			System.out.println(crudArray[position] + " is at index " + position);
			this.position++;
		} else {
			System.err.println("ArrayIndexOutOfBOundException");
		}

	}

}
