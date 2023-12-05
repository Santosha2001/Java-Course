package com.xworkz.assignment35.app.services.artist;

import com.xworkz.assignment35.app.repositary.artist.ArtistRepositary;

public class ArtistServicesImpl implements ArtistService {

	private ArtistRepositary arttistRepositary;

	public ArtistServicesImpl(ArtistRepositary arttistRepositary) {
		super();
		this.arttistRepositary = arttistRepositary;
	}

	@Override
	public boolean artists(String artist) {
		if (artist != null && !artist.isEmpty() && artist.length() > 2) {
			System.out.println("Artist item is valid");
			this.arttistRepositary.artists(artist);
		} else {
			System.out.println("Artist item is in-valid");
		}
		return false;
	}

}
