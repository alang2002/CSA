
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String bookTitle;
    private int review;

    /**
     * Constructor for objects of class Book
     */
    public Book()
    {
        // initialise instance variables
        review = 0;
        bookTitle = "";
    }

    public String getBTitle() {
        return bookTitle;
    }
    
    public void setBTitle(String b) {
        bookTitle = b;
    }
    
    public int getReview() {
        return review;
    }
    
    public void setReview(int w) {
        review = w;
    }
}
