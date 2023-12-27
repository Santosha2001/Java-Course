package com.xworkz.songApplication.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SongDTO {
	@NotNull(message = "Song name can't be empty")
	@Size(min = 3, max = 30, message = "Song name should be in specified range.")
	private String songName;

	@NotNull(message = "Movie name can't be empty")
	@Size(min = 3, max = 30, message = "Movie name should be in specified range.")
	private String movieName;

	@NotNull(message = "Director name can't be empty")
	@Size(min = 3, max = 30, message = "Director name should be in specified range.")
	private String directorName;

	@NotNull(message = "Producer name can't be empty")
	@Size(min = 3, max = 30, message = "Producer name should be in specified range.")
	private String producerName;

	@NotNull(message = "Lyrisist name can't be empty")
	@Size(min = 3, max = 30, message = "Lyrisist name should be in specified range.")
	private String lyrisistName;

	@NotNull(message = "Singer name can't be empty")
	@Size(min = 3, max = 30, message = "Singer name should be in specified range.")
	private String singerName;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate releaseYear;
}
