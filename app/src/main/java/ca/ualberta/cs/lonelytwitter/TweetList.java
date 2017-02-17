package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;

import static com.google.common.collect.Iterables.size;

/**
 * Created by Alex on 2017-02-16.
 */

public class TweetList {
    private ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();

    public void add(NormalTweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet(NormalTweet tweet){
        return tweets.contains(tweet);
    }

    public NormalTweet getTweet(int index){
        //return new NormalTweet("not the tweet");
        return tweets.get(0);
    }

    public void delete(NormalTweet tweet){
        tweets.remove(tweet);
    }

    //---------------------------------------
    public void addTweet(NormalTweet tweet) {
        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException("Tweet already exists");
        } else {
            tweets.add(tweet);
        }
    }

    public ArrayList<NormalTweet> getTweets(){
        return tweets;
    }

    public int getCount(){
        return tweets.size();
    }
}
