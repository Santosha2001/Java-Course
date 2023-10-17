package com.xworkz.engineer.app.dto;

import java.io.Serializable;

public class EngineerDTO  implements Serializable{

	private int id;
	private String name;
	private String collegeName;

	public EngineerDTO() {
		// TODO Auto-generated constructor stub
	}

	public EngineerDTO(int id, String name, String collegeName) {
		super();
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "EngineerDTO [id=" + id + ", name=" + name + ", collegeName=" + collegeName + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof EngineerDTO) {
				EngineerDTO dto = (EngineerDTO) obj;
				if (dto.name.equals(name) && dto.collegeName.equals(collegeName) && dto.id == id) {
					return true;
				}
			}
		}
		return super.equals(obj);
	}
}
