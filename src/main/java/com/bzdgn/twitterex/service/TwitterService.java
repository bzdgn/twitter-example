package com.bzdgn.twitterex.service;

import java.util.List;

import twitter4j.TwitterException;

public interface TwitterService {
	
	List<String> getTimeLine() throws TwitterException;
	List<String> searchtweets(String searchString) throws TwitterException;

}
