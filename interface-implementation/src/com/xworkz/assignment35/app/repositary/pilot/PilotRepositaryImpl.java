package com.xworkz.assignment35.app.repositary.pilot;

public class PilotRepositaryImpl implements PilotRepositary {

	private String[] pilotArray = new String[NO_OF_PILOTS];
	int position;

	@Override
	public void pilot(String pilot) {
		if (this.position < NO_OF_PILOTS) {
			this.pilotArray[position] = pilot;
			System.out.println(pilotArray[position] + " is at index " + position);
			this.position++;
		} else {
			System.out.println("ArrayIndexOutOfBoundException");
		}
	}

}
