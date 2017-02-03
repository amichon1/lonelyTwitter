package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * HappyMood extends Mood
 */

public class HappyMood extends Mood {

    /**
     * creates a "happy face" string
     * @param date
     * @param mood
     */
    public HappyMood(Date date, String mood){
        super(date, mood);
    }

    public HappyMood(String mood){
        super(mood);
    }

    public String mood(){
        return ":)";
    }

}
