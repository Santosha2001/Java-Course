package com.xworkz.assignme24.encapsulation.app.github;

public class GitHub {

	private String username;
	private String repositoryName;
	private int stars;
	private int forks;
	private String language;
	private String description;
	private boolean isPrivate;
	private String ownerName;
	private String ownerEmail;
	private String website;
	private int issues;
	private String lastCommit;
	private int pullRequests;
	private boolean hasWiki;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRepositoryName() {
		return repositoryName;
	}

	public void setRepositoryName(String repositoryName) {
		this.repositoryName = repositoryName;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public int getForks() {
		return forks;
	}

	public void setForks(int forks) {
		this.forks = forks;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public int getIssues() {
		return issues;
	}

	public void setIssues(int issues) {
		this.issues = issues;
	}

	public String getLastCommit() {
		return lastCommit;
	}

	public void setLastCommit(String lastCommit) {
		this.lastCommit = lastCommit;
	}

	public int getPullRequests() {
		return pullRequests;
	}

	public void setPullRequests(int pullRequests) {
		this.pullRequests = pullRequests;
	}

	public boolean hasWiki() {
		return hasWiki;
	}

	public void setHasWiki(boolean hasWiki) {
		this.hasWiki = hasWiki;
	}

}
