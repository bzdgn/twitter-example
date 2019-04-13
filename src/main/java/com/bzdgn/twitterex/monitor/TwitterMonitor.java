package com.bzdgn.twitterex.monitor;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bzdgn.twitterex.service.TwitterService;

import twitter4j.TwitterException;

@Component
public class TwitterMonitor {
	
	@Autowired
	private TwitterService twitterService;
	
	@Scheduled(fixedRate = 1000, initialDelay = 500)
	public void monitorTwitter() throws TwitterException {
		System.out.println("Home Timeline at" + new Date());
		System.out.println("********************************");
		for (String tweet : twitterService.getTimeLine()) {
			System.out.println(tweet);
		}
	}

}
