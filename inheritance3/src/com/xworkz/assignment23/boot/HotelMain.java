package com.xworkz.assignment23.boot;

import com.xworkz.assignment23.app.hotel.Canteen;
import com.xworkz.assignment23.app.hotel.Hotel;

public class HotelMain {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.hotel();
		hotel.hotel("Sagar");
		hotel.hotel("Sagar",9);
		hotel.hotel("Sagar",9,11);
		hotel.hotel("Sagar",9,11,"Davanagere");
		hotel.hotel("Sagar",9,11,"Davanagere","Karnataka");
		
		System.out.println("\n");
		
		Hotel hotel2 = new Canteen();
		hotel2.hotel();
		hotel2.hotel("Nandi");
		hotel2.hotel("Nandi",9);
		hotel2.hotel("Nandi",9,11);
		hotel2.hotel("Nandi",9,11,"Davanagere");
		hotel2.hotel("Nandi",9,11,"Davanagere","Karnataka");
	}
	
}
