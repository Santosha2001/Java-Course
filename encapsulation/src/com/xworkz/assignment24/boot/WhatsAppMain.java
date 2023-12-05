package com.xworkz.assignment24.boot;

import com.xworkz.assignme24.encapsulation.app.whatsapp.WhatsApp;

public class WhatsAppMain {
	public static void main(String[] args) {
		WhatsApp app = new WhatsApp();
		app.setContactName("Santhu");
		System.out.println(app.getContactName());

		app.setPhoneNumber("Santhu");
		System.out.println(app.getPhoneNumber());

		app.setProfilePicture("Santosh");
		System.out.println(app.getProfilePicture());

		app.setStatus("Bindhu");
		System.out.println(app.getStatus());

		app.setLastSeen("suhas");
		System.out.println(app.getLastSeen());

		app.setMediaShared(1);
		System.out.println(app.getMediaShared());

		app.setMuted(false);
		System.out.println(app.isMuted());

		app.setTotalMessages(3);
		System.out.println(app.getTotalMessages());

		app.setUnreadMessages(5);
		System.out.println(app.getUnreadMessages());

		app.setOnline(true);
		System.out.println(app.isOnline());

		app.setCurrentChat("aishu");
		System.out.println(app.getCurrentChat());

		app.setBlocked(false);
		System.out.println(app.isBlocked());

		app.setAbout("Santhu C");
		System.out.println(app.getAbout());

	}
}
