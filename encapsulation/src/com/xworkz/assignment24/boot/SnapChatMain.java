package com.xworkz.assignment24.boot;

import com.xworkz.assignme24.encapsulation.app.snapchat.SnapChat;

public class SnapChatMain {
	public static void main(String[] args) {
		SnapChat snapchat = new SnapChat();

		snapchat.setUsername("harish");
		System.out.println(snapchat.getUsername());

		snapchat.setPhonenumber(9900488690d);
		System.out.println(snapchat.getPhoneNumber());

		snapchat.setColor("yellow");
		System.out.println(snapchat.getColor());

		snapchat.setShape("squar");
		System.out.println(snapchat.getShape());

		snapchat.setStartyear(2011);
		System.out.println(snapchat.getStartyear());

		snapchat.setVedio("Vedio");
		System.out.println(snapchat.getVedio());

		snapchat.setchat("Chat");
		System.out.println(snapchat.getChat());

		snapchat.setLenses("Lenses");
		System.out.println(snapchat.getLenses());

		snapchat.setStory("Story");
		System.out.println(snapchat.getStory());

		snapchat.setSnapmap("Snapmap");
		System.out.println(snapchat.getSnapmap());

		snapchat.setSnapcode(75647);
		System.out.println(snapchat.getSnapcode());

		snapchat.setFilter("Filter");
		System.out.println(snapchat.getFilter());

		snapchat.setSharingdata(10002);
		System.out.println(snapchat.getSharingdata());

		snapchat.setInformation("Information");
		System.out.println(snapchat.getInformation());
	}
}
