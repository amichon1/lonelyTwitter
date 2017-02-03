package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Alex on 2017-01-19.
 */

/**
 * gets and sets a tweet
 */
public interface Tweetable {
    /**
     * @throws TweetTooLongException
     */
    public String getMessage();
    public void setMessage(String string) throws TweetTooLongException;


}
