package com.santosh.standalone.collection;

import java.util.List;
import java.util.Map;

public class Person {

	private String name;
	private List<String> friends;
	private Map<String, Integer> subjectMarks;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", friends=" + friends + ", subjectMarks=" + subjectMarks + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public void setSubjectMarks(Map<String, Integer> subjectMarks) {
		this.subjectMarks = subjectMarks;
	}

	public Map<String, Integer> getSubjectMarks() {
		return subjectMarks;
	}

}
