package com.xworkz.assignment35.services.boot;

import com.xworkz.assignment35.app.repositary.artist.ArtistRepositary;
import com.xworkz.assignment35.app.repositary.artist.ArtistRepositaryImppl;
import com.xworkz.assignment35.app.services.artist.ArtistService;
import com.xworkz.assignment35.app.services.artist.ArtistServicesImpl;

public class ArtistServicesMain {

	public static void main(String[] args) {
		System.out.println("Artist in ArtistServices");
		System.out.println();

		ArtistRepositary artistRepositary = new ArtistRepositaryImppl();

		ArtistService artistService = new ArtistServicesImpl(artistRepositary);
		artistService.artists("Musician");
		artistService.artists("Dancer");
		artistService.artists("Singer");
		System.out.println();

		artistService.artists("");
		System.out.println();

		artistService.artists("a");
		System.out.println();

		artistService.artists(null);

	}

}
