package com.xworkz.assignment24.boot;

import com.xworkz.assignme24.encapsulation.app.facebook.FaceBook;

public class FaceBookMain {
	public static void main(String[] args) {
		FaceBook user = new FaceBook();

		user.setUsername("john_doe");
		user.setFullName("John Doe");
		user.setAge(28);
		user.setGender("Male");
		user.setStatus("Feeling adventurous!");
		user.setFriendCount(500);
		user.setOnlineStatus(true);
		user.setProfilePictureUrl("https://example.com/john_profile.jpg");
		user.setCurrentCity("New York");
		user.setHometown("Los Angeles");
		user.setRelationshipStatus("Single");
		user.setPhotosCount(150);
		user.setPostCount(300);
		user.setLikesCount(1200);

		System.out.println("Username: " + user.getUsername());
		System.out.println("Full Name: " + user.getFullName());
		System.out.println("Age: " + user.getAge());
		System.out.println("Gender: " + user.getGender());
		System.out.println("Status: " + user.getStatus());
		System.out.println("Friend Count: " + user.getFriendCount());
		System.out.println("Online Status: " + user.isOnlineStatus());
		System.out.println("Profile Picture URL: " + user.getProfilePictureUrl());
		System.out.println("Current City: " + user.getCurrentCity());
		System.out.println("Hometown: " + user.getHometown());
		System.out.println("Relationship Status: " + user.getRelationshipStatus());
		System.out.println("Photos Count: " + user.getPhotosCount());
		System.out.println("Post Count: " + user.getPostCount());
		System.out.println("Likes Count: " + user.getLikesCount());

	}
}
