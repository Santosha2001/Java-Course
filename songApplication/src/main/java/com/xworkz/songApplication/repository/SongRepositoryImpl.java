package com.xworkz.songApplication.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.songApplication.dto.SongDTO;

@Repository
public class SongRepositoryImpl implements SongRepository {
	public SongRepositoryImpl() {
		System.out.println("SongRepositoryImpl");
	}

	@Override
	public boolean saveAndValidateSong(SongDTO songDTO) {
		return true;

	}
}
