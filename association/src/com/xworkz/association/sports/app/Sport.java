package com.xworkz.association.sports.app;

public class Sport {
	public String sportName;
	public Player[] players;

	public Sport(String sportName, Player[] players) {
		// TODO Auto-generated constructor stub
		this.sportName = sportName;
		this.players = players;
	}

	public void sportMethod() {
		System.out.println("sportName: " + sportName);

		for (int index = 0; index < players.length; index++) {
			Player playerRef = players[index];
			playerRef.playerMethod();
		}
	}
}
