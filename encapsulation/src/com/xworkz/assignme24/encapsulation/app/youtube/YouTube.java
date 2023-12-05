package com.xworkz.assignme24.encapsulation.app.youtube;

public class YouTube {
	private int subscriber;
	private boolean subscription;
	private int views;
	private int likes;
	private int dislike;
	private String channelName;
	private String owner;
	private boolean good;
	private int appSize;
	private String name;
	private float apiKey;
	private int comments;
	private int watchHour;
	private long downloads;

	public int getSubscriber() {
		return subscriber;
	}

	public boolean isSubscription() {
		return subscription;
	}

	public int getViews() {
		return views;
	}

	public int getLikes() {
		return likes;
	}

	public int getDislike() {
		return dislike;
	}

	public String getChannelName() {
		return channelName;
	}

	public String getOwner() {
		return owner;
	}

	public boolean getGood() {
		return good;
	}

	public int getAppSize() {
		return appSize;
	}

	public String getName() {
		return name;
	}

	public float getApiKey() {
		return apiKey;
	}

	public int getComments() {
		return comments;
	}

	public int getWatchHour() {
		return watchHour;
	}

	public long getDownloads() {
		return downloads;
	}

	public void setSubscriber(int subscriber) {
		this.subscriber = subscriber;
	}

	public void isSubscription(boolean subscription) {
		this.subscription = subscription;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void setDislike(int dislike) {
		this.dislike = dislike;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;

	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	public void setAppSize(int appSize) {
		this.appSize = appSize;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setApiKey(float apiKey) {
		this.apiKey = apiKey;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public int setWatchHour(int watchHour) {
		return watchHour;
	}

	public long setDownloads(long downloads) {
		return downloads;
	}
}
