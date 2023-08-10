package com.xworkz.assignme24.encapsulation.app.whatsapp;

public class WhatsApp {
	private String contactName;
	private String phoneNumber;
	private String status;
	private String profilePicture;
	private int totalMessages;
	private int unreadMessages;
	private boolean isOnline;
	private String lastSeen;
	private boolean isBlocked;
	private String currentChat;
	private String groups;
	private int mediaShared;
	private String about;
	private boolean isMuted;

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public int getTotalMessages() {
		return totalMessages;
	}

	public void setTotalMessages(int totalMessages) {
		this.totalMessages = totalMessages;
	}

	public int getUnreadMessages() {
		return unreadMessages;
	}

	public void setUnreadMessages(int unreadMessages) {
		this.unreadMessages = unreadMessages;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	public String getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(String lastSeen) {
		this.lastSeen = lastSeen;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public String getCurrentChat() {
		return currentChat;
	}

	public void setCurrentChat(String currentChat) {
		this.currentChat = currentChat;
	}

	public String getGroups() {
		return groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}

	public int getMediaShared() {
		return mediaShared;
	}

	public void setMediaShared(int mediaShared) {
		this.mediaShared = mediaShared;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public boolean isMuted() {
		return isMuted;
	}

	public void setMuted(boolean isMuted) {
		this.isMuted = isMuted;
	}

}
