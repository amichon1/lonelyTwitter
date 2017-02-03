package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This Class is a tweet
 */

public abstract class Tweet extends Object{
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getMessage() {
        return message;
    }
    private Date date;
    private String message;

    /**
     * Sets a message
     * Checks if message is too long
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }


    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Saves date of a message
     * @param date
     * @param message
     */
    public Tweet(Date date, String message){
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

}
