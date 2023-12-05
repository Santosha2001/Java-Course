package com.xworkz.assignment35.app.repositary.jacket;

public class JacketRepositaryImpl implements JacketRepositary {

	private String[] jacketArray = new String[JACKETS];
	private int position;

	@Override
	public void jackets(String jacket) {
		if (this.position < JACKETS) {
			this.jacketArray[position] = jacket;
			System.out.println(jacketArray[position] + " is at index " + position);
			this.position++;
		}else {
			System.err.println("ArrayIndexOutOfBOundException");
		}
	}

}
