package com.xworkz.assignment24.boot;

import com.xworkz.assignme24.encapsulation.app.instagram.Instagram;

public class InstagramMain {
	public static void main(String[] args) {
		Instagram instagram = new Instagram();

		instagram.setColor("red");
		System.out.println(instagram.getColor());

		instagram.setShape("squar");
		System.out.println(instagram.getShape());

		instagram.setExplore("Explore");
		System.out.println(instagram.getExplore());

		instagram.setProfile("Profile");
		System.out.println(instagram.getProfile());

		instagram.setPost("Post");
		System.out.println(instagram.getPost());

		instagram.setFeed("Feed");
		System.out.println(instagram.getFeed());

		instagram.setReels("Reels");
		System.out.println(instagram.getReels());

		instagram.setStory("Story");
		System.out.println(instagram.getStory());

		instagram.setLikes("Likes");
		System.out.println(instagram.getLikes());

		instagram.setPrivacy("Privacy");
		System.out.println(instagram.getPrivacy());

		instagram.setHashtage("Hashtage");
		System.out.println(instagram.getHashtage());

		instagram.setFollowing("Following");
		System.out.println(instagram.getFollowing());

		instagram.setFilter("Filter");
		System.out.println(instagram.getFilter());

		instagram.setAccount("Account");
		System.out.println(instagram.getAccount());

	}
}
