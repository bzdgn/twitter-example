package com.bzdgn.twitterex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import twitter4j.TwitterException;

@SpringBootApplication
@EnableScheduling
public class Application{
	
    public static void main(String[] args) throws TwitterException, InterruptedException {
        SpringApplication.run(Application.class, args);        
    }

}
