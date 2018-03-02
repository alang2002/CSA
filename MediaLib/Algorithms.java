
/**
 * Write a description of class Algorithms here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Algorithms
{
    public static void main() {
        Song [] topTenSongs = {new Song("The Twist", 5), new Song("Smooth", 2), new Song("Mack The Knife", 2), new Song("How Do I Live", 3), 
                new Song("Party Rock Anthem", 10), new Song("I Gotta Feeling", 8), new Song("Macarena (Bayside Boys Mix)", 9), new Song("Physical", 1), 
                new Song("You Light Up My Life", 2), new Song("Hey Jude", 6)};
        int bestSoFar = topTenSongs[0].getRating();
        int worstSoFar = topTenSongs[7].getRating();
        String bestTitle = topTenSongs[0].getTitle();
        String worstTitle = topTenSongs[7].getTitle();
        String tied = null;
        for (Song s : topTenSongs) {
            System.out.println(s.getTitle() + " " + s.getRating());
        }
        for (int i = 0; i < topTenSongs.length - 1; i++) {
            if (topTenSongs[i].getRating() < bestSoFar) {
                bestSoFar = topTenSongs[i].getRating();
                bestTitle = topTenSongs[i].getTitle();
            }
            if (topTenSongs[i].getRating() > worstSoFar) {
                worstSoFar = topTenSongs[i].getRating();
                worstTitle = topTenSongs[i].getTitle();
            }
        }
        System.out.println();
        System.out.println("Highest rated song: " + bestTitle + " " + bestSoFar);
        System.out.println("Lowest rated song: " + worstTitle + " " + worstSoFar);
        System.out.println();
        System.out.println("Songs rated at 2: ");
        for (Song s : topTenSongs) {
            if (s.getRating() == 2) {
                tied = s.getTitle();
                System.out.println(tied);
            }
        }
        
        String songToDelete = "I Gotta Feeling";
        for (int i = 0; i < topTenSongs.length - 1; i++) {
            if (topTenSongs[i].equals(songToDelete)) {
                
            }
        }
    }
}
