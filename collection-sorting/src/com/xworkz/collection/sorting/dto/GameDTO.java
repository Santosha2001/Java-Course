package com.xworkz.collection.sorting.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class GameDTO implements Serializable, Comparable<GameDTO> {
	private Integer id;
	private String name;
	private Integer particiapntes;
	private Integer points;
	private LocalDate eventDate;
	private String winner;
	private String runnerUp;
	private Integer duration;

	public GameDTO() {
		// TODO Auto-generated constructor stub
	}

	public GameDTO(Integer id, String name, Integer particiapntes, Integer points, LocalDate eventDate, String winner,
			String runnerUp, Integer duration) {
		super();
		this.id = id;
		this.name = name;
		this.particiapntes = particiapntes;
		this.points = points;
		this.eventDate = eventDate;
		this.winner = winner;
		this.runnerUp = runnerUp;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "GameDTO [id=" + id + ", name=" + name + ", particiapntes=" + particiapntes + ", points=" + points
				+ ", eventDate=" + eventDate + ", winner=" + winner + ", runnerUp=" + runnerUp + ", duration="
				+ duration + "]";
	}

	@Override
	public int compareTo(GameDTO game) {

		return this.id.compareTo(game.id);
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getParticiapntes() {
		return particiapntes;
	}

	public Integer getPoints() {
		return points;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public String getWinner() {
		return winner;
	}

	public String getRunnerUp() {
		return runnerUp;
	}

	public Integer getDuration() {
		return duration;
	}

}
