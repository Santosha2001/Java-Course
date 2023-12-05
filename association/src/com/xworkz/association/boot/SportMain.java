package com.xworkz.association.boot;

import com.xworkz.association.sports.app.*;
//import com.xworkz.association.sports.app.Player;

public class SportMain {
	public static void main(String[] args) {
		String nameOfSport = "Cricket";

		Lift lift1 = new Lift(2);
		Lift lift2 = new Lift(4);

		Lift[] lifts = { lift1, lift2 };

		Floor floor1 = new Floor(2, 5);
		Floor floor2 = new Floor(1, 5);
		Floor floor3 = new Floor(4, 5);
		Floor floor4 = new Floor(5, 5);
		Floor floor5 = new Floor(2, 8);
		Floor floor6 = new Floor(1, 5);
		Floor floor7 = new Floor(2, 5);

		Floor[] floors = { floor1, floor2, floor3, floor4, floor5, floor6, floor7 };

		Building building1 = new Building(floors, lifts);
		Building building2 = new Building(floors, lifts);

		Building[] buildings = { building1, building2 };

		Corporator corporator = new Corporator("Santhu", buildings);

		Area area1 = new Area("Davanagere", corporator);
		Area area2 = new Area("Hospete", corporator);
		Area area3 = new Area("Bengalore", corporator);
		Area area4 = new Area("Harihara", corporator);
		Area area5 = new Area("Bellary", corporator);

		Area[] areas = { area1, area2, area3, area4, area5 };

		HomeTown homeTown = new HomeTown("Hospete", 583219, areas);

		Player player1 = new Player("Dhoni", 10, building1, homeTown);
		Player player2 = new Player("Virat", 8, building2, homeTown);
		Player player3 = new Player("Rohit", 7, building1, homeTown);
		Player player4 = new Player("Jadeja", 7, building1, homeTown);
		Player player5 = new Player("Gill", 2, building2, homeTown);

		Player[] players = { player1, player2, player3, player4, player5 };

		Sport sport = new Sport(nameOfSport, players);

		sport.sportMethod();

	}
}
