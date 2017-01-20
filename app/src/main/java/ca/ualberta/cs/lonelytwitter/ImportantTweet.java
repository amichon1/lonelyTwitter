package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Alex on 2017-01-19.
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
