package com.xworkz.crudrevuse.app.dto;

public class StudentDTO {

	private String name;
	private int age;
	private String college;

	public StudentDTO() {

	}

	public StudentDTO(String name, int age, String college) {
		super();
		this.name = name;
		this.age = age;
		this.college = college;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", age=" + age + ", college=" + college + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof StudentDTO) {
				StudentDTO dto = (StudentDTO) obj;
				if (dto.name.equals(name) && dto.college.equals(college) && dto.age == age) {
					return true;
				}
			}
		}

		return super.equals(obj);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
}
