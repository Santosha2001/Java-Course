package com.xworkz.assignment35.app.repositary.juice;

public class JuiceRepositaryImpl implements JuiceRepositary {

	private String[] juices = new String[TOTAL_ITEMS];

	int position;

	@Override
	public void store(String juice) {
		if (this.position < TOTAL_ITEMS) {
			this.juices[position] = juice;
			System.out.println(this.juices[position] + "Jice is at index " + position);
			this.position++;
		} else {
			System.err.println("invalid");
		}

	}

	@Override
	public boolean isExist(String juice) {
		for (int index = 0; index <=this.position; index++) {
			String temp = juices[index];
			if (temp != null && temp.equals(juice)) {
				System.out.println("value is stored at index " + position);
				return true;
			} 
		}
		return JuiceRepositary.super.isExist(juice);
	}
}
