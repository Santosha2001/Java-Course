package com.xworkz.songApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.songApplication.dto.SongDTO;
import com.xworkz.songApplication.repository.SongRepository;

@Service
public class SongServiceImpl implements SongService {
	@Autowired
	private SongRepository repository;

	public SongServiceImpl() {
		System.out.println("SongServiceImpl");
	}

	@Override
	public boolean saveAndValidate(SongDTO songDTO) {
		this.repository.saveAndValidateSong(songDTO);
		return true;
	}
}
