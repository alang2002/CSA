
/**
 * What trash is Mr. Brocious playing?
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    private int rating;
    private String title;
    private double price;
    private boolean favorite;

    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        price = 0.0;
        favorite = false;
    }

    public Song(String title) {
        this.title = title;
    }

    public Song(String title, int rating)
    {
        this.title = title;
        this.rating = rating;
    }

    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        favorite = false;
        //this.totalCost += totalCost + price;
        //this.numSongs += numSongs + 1;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setPrice(double p) {
        price = p;
    }

    /*
     * 
     * LEAVE THESE METHODS ALONE, DO NOT TOUCH. 
     * 
     *

    public double getAverageCost() {
    this.averageCost = this.totalCost / this.numSongs;
    return averageCost;
    }

    public double getAverageRating() {
    this.averageRating = totalRatings / numSongs;
    return averageRating;
    }
     */
}
