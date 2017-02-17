package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by Alex on 2017-02-16.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }


    /*public void testAddTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet= new NormalTweet("some tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }*/

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet= new NormalTweet("some tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet= new NormalTweet("some tweet");

        tweets.add(tweet);
        NormalTweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(),tweet.getMessage());
        assertEquals(returnedTweet.getDate(),tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet= new NormalTweet("some tweet");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    //-------------------------------------------------

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet= new NormalTweet("some tweet");

        tweets.addTweet(tweet);
        try{
            tweets.addTweet(tweet);
            assertTrue(false);
        }
        catch (IllegalArgumentException e){
            assertTrue(true);
        }
        //assertEquals(tweets.addTweet(tweet2), "Tweet already exists");
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        NormalTweet tweet= new NormalTweet("some tweet");
        NormalTweet tweet2= new NormalTweet("another tweet");

        tweets.addTweet(tweet);
        tweets.addTweet(tweet2);
        ArrayList<NormalTweet> myList  = tweets.getTweets();

        assertEquals(myList.get(0), tweet );
        assertEquals(myList.get(1), tweet2 );

    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        NormalTweet tweet= new NormalTweet("some tweet");
        NormalTweet tweet2= new NormalTweet("No Way");

        tweets.add(tweet);
        tweets.add(tweet2);
        int count = tweets.getCount();
        //Fail Version
        //assert(count, 0)
        assertEquals(count, 2);
    }

}
