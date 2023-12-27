package com.xworkz.songApplication.service;

import com.xworkz.songApplication.dto.SongDTO;

public interface SongService {

	boolean saveAndValidate(SongDTO songDTO);

}