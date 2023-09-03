package com.xworkz.assignment35.boot;

import com.xworkz.assignment35.app.repositary.artist.ArtistRepositary;
import com.xworkz.assignment35.app.repositary.artist.ArtistRepositaryImppl;

public class ArtistRepositaryMain {

	public static void main(String[] args) {
		ArtistRepositary artistRepositary = new ArtistRepositaryImppl();

		System.out.println("Artists are implementing in ArtistRepositaryImpl");

		artistRepositary.artists("Musician");
		artistRepositary.artists("Dancer");
		artistRepositary.artists("Scketcher");
		artistRepositary.artists("Folk Singer");
		artistRepositary.artists("Drawing");
		artistRepositary.artists("Clasical Singer");
		artistRepositary.artists("Rap Singer");
		artistRepositary.artists("Baratha Natya Dancer");
		artistRepositary.artists("Fluet Singer");
		artistRepositary.artists("DJ Artist");

		artistRepositary.artists("Swimmer");

	}

}
