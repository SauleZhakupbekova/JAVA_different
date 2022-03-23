package L6_Classes_Types;

import java.util.Date;

public class Feedback {
    private String username;
    private int rating;
    private Date date;
    private String text;

    public Feedback() {
    }

    public Feedback(String username, int rating, Date date, String text) {

        this.username = username;
        this.rating = rating;
        this.date = date;
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
