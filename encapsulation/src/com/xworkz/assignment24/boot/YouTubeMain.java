package com.xworkz.assignment24.boot;

import com.xworkz.assignme24.encapsulation.app.youtube.YouTube;

public class YouTubeMain {
	public static void main(String[] args) {
		YouTube you = new YouTube();
		System.out.println(you.getSubscriber());
		System.out.println(you.isSubscription());
		System.out.println(you.getViews());
		System.out.println(you.getLikes());
		System.out.println(you.getDislike());
		System.out.println(you.getChannelName());
		System.out.println(you.getOwner());
		System.out.println(you.getGood());
		System.out.println(you.getAppSize());
		System.out.println(you.getName());
		System.out.println(you.getApiKey());
		System.out.println(you.getWatchHour());
		System.out.println(you.getDownloads());
		System.out.println(you.getComments());

		System.out.println("+++++++++++++++++++++++");
		you.setSubscriber(12350000);
		you.isSubscription();
		you.setViews(1554546);
		you.setLikes(45454);
		you.setDislike(45454);
		you.setChannelName("hjgH");
		you.setOwner("bbk vines");
		you.setGood(false);
		you.setAppSize(455);
		you.setName("bbvinesss");
		you.setApiKey(5454464644.04f);
		System.out.println("=========================");
		YouTube you1 = new YouTube();
		System.out.println(you1.getSubscriber());
		System.out.println(you1.isSubscription());
		System.out.println(you1.getViews());
		System.out.println(you1.getLikes());
		System.out.println(you1.getDislike());
		System.out.println(you1.getChannelName());
		System.out.println(you1.getOwner());
		System.out.println(you1.getGood());
		System.out.println(you1.getAppSize());
		System.out.println(you1.getName());
		System.out.println(you1.getApiKey());
		System.out.println(you1.getWatchHour());
		System.out.println(you1.getDownloads());
		System.out.println(you.getComments());
	}
}
