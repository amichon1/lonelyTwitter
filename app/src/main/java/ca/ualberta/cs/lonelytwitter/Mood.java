package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Allows user to return their mood as a string
 */

public abstract class Mood {


    private Date date;
    private String mood;

    /**
     * creates a mood and date
     * @param mood
     */
    public Mood(String mood){
        this.mood = mood;
        this.date = new Date();
    }

    public Mood(Date date, String mood){
        this.date = date;
        this.mood = mood;
    }

    /**
     * gets the mood
     * @return mood
     */
    public String getMood() {
        return mood;
    }

    /**
     * sets the mood
     * @param mood
     */
    public void setMood(String mood) {
        this.mood = mood;
    }

    /**
     * gets the date
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * sets the date
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String mood();


}
