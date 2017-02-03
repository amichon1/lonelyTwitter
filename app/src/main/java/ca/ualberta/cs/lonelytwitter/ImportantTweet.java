package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * ImportantTweet extends Tweet
 */

public class ImportantTweet extends Tweet {

    public ImportantTweet(Date date, String message){
        super(date, message);
    }

    public ImportantTweet(String message){
        super(message);
    }

    public Boolean isImportant(){
        return true;
    }
}
