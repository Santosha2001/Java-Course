package com.xworkz.assignment24.boot;

import com.xworkz.assignme24.encapsulation.app.github.GitHub;

public class GitHubMain {
	public static void main(String[] args) {
		GitHub gitHub = new GitHub();
		gitHub.setUsername("Santhu");
		System.out.println(gitHub.getUsername());

		gitHub.setRepositoryName("Java");
		System.out.println(gitHub.getRepositoryName());

		gitHub.setStars(5);
		System.out.println(gitHub.getStars());

		gitHub.setForks(4);
		System.out.println(gitHub.getForks());

		gitHub.setLanguage("english");
		System.out.println(gitHub.getLanguage());

		gitHub.setLastCommit("override");
		System.out.println(gitHub.getLastCommit());

		gitHub.setDescription("Programmer");
		System.out.println(gitHub.getDescription());

		gitHub.setIssues(0);
		System.out.println(gitHub.getIssues());

		gitHub.setPrivate(false);
		System.out.println(gitHub.isPrivate());

		gitHub.setOwnerName("Santhu");
		System.out.println(gitHub.getOwnerName());

		gitHub.setOwnerEmail("Santhu@gmail");
		System.out.println(gitHub.getOwnerEmail());

		gitHub.setWebsite("Santhu.com");
		System.out.println(gitHub.getWebsite());

		gitHub.setPullRequests(4);
		System.out.println(gitHub.getPullRequests());

	}
}
