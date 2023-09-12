package com.xworkz.assignment38.findby.app.dto;

import java.io.Serializable;

public class DeveloperDTO implements Serializable {

	private String name;
	private String workingFor;
	private String designation;
	private int experience;
	private double salary;
	private boolean difficult;

	public DeveloperDTO() {
		// TODO Auto-generated constructor stub
	}

	public DeveloperDTO(String name, String workingFor, String designation, int experience, double salary,
			boolean difficult) {
		super();
		this.name = name;
		this.workingFor = workingFor;
		this.designation = designation;
		this.experience = experience;
		this.salary = salary;
		this.difficult = difficult;
	}

	@Override
	public String toString() {
		return "DeveloperDTO [name=" + name + ", workingFor=" + workingFor + ", designation=" + designation
				+ ", experience=" + experience + ", salary=" + salary + ", difficult=" + difficult + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {

			if (obj instanceof DeveloperDTO) {
				DeveloperDTO developerDTO = (DeveloperDTO) obj;
				if (developerDTO.name.equals(name) && developerDTO.workingFor.equals(workingFor)
						&& developerDTO.designation.equals(designation)) {
					return true;
				}

			}
		}
		return super.equals(obj);
	}

	public String getName() {
		return name;
	}

	public String getWorkingFor() {
		return workingFor;
	}

	public String getDesignation() {
		return designation;
	}

	public int getExperience() {
		return experience;
	}

	public double getSalary() {
		return salary;
	}

	public boolean isDifficult() {
		return difficult;
	}

}
