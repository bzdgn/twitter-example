package com.bzdgn.twitterex;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.bzdgn.twitterex.service.TwitterService;
import com.bzdgn.twitterex.service.TwitterServiceImpl;

import twitter4j.TwitterException;

@SpringBootApplication
@EnableScheduling
public class Application{
	
    public static void main(String[] args) throws TwitterException, InterruptedException {
        SpringApplication.run(Application.class, args);
        
//        TwitterService twitterService = new TwitterServiceImpl();
//        Set<String> tweets = new HashSet();
//        while(true) {
//        	for(String tweet: twitterService.getTimeLine()) {
//        		boolean result = tweets.add(tweet);
//        		
//        		if (result) {
//        			System.out.println(tweet);
//        		}
//        	}
//        	
//        	Thread.sleep(2000);
//        }
        
    }

}
