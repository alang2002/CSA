
/**
 * I have never seen Star Wars
 *
 * @author Aaron Lang/Dalton Hook
 * @version 1/19/2018
 */
public class Movies
{
    // instance variables - replace the example below with your own
    private String name;
    private int score;
    private int duration;

    /**
     * Constructor for objects of class Movies
     */
    public Movies()
    {
        // initialise instance variables
        name = "";
        score = 0;
        duration = 0;
    }

   
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int s) {
        score = s;
    }
    
    /*public int getDuration() {
        return duration;
    }*/
    
    public void setDuration(int d) {
        duration = d;
    }
    
    public void printDuration() {
        System.out.println("Movie length is " + duration / 60 + " hours, " + duration % 60 + " minutes.");
        /*System.out.println("Minutes: " + duration);
        System.out.print("Hours");
        System.out.print(duration / 60);
        System.out.println();*/
        
    }
}
