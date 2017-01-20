package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Alex on 2017-01-19.
 */

public class SadMood extends Mood {

    public SadMood(Date date, String mood){
        super(date, mood);
    }

    public SadMood(String mood){
        super(mood);
    }

    public String mood(){
        return ":(";
    }

}
