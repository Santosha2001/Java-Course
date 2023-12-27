package com.xworkz.songApplication.repository;

import com.xworkz.songApplication.dto.SongDTO;

public interface SongRepository {

	boolean saveAndValidateSong(SongDTO songDTO);

}