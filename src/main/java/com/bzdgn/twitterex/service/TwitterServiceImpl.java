package com.bzdgn.twitterex.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

@Service
public class TwitterServiceImpl implements TwitterService {
	
	private final Twitter twitter;
	
	public TwitterServiceImpl() {
		this.twitter = TwitterFactory.getSingleton();
	}
	
	public List<String> getTimeLine() throws TwitterException {
		ResponseList<Status> responseList = twitter.getHomeTimeline();
		
		for(Status status: responseList) {
			System.out.println("Text:           " + status.getText());
			System.out.println("User:           " + status.getUser());
			System.out.println("Id:             " + status.getId());
			System.out.println("Language:       " + status.getLang());
			System.out.println("Favorite Count: " + status.getFavoriteCount());
		}
		
		return twitter.getHomeTimeline().stream().map(item -> item.getText()).collect(Collectors.toList());
	}
	
	public List<String> searchtweets(String searchString) throws TwitterException {
	    Query query = new Query(searchString);
	    QueryResult result = twitter.search(query);
	     
	    return result.getTweets().stream()
	      .map(item -> item.getText())
	      .collect(Collectors.toList());
	}

}
