
/**
 * Write a description of class Algorithms here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Algorithms
{
    public static void main() {
        // Initialize most variables here
        Song [] topTenSongs = {new Song("The Twist", 5), new Song("Smooth", 2), new Song("Mack The Knife", 2), new Song("How Do I Live", 3), 
                new Song("Party Rock Anthem", 10), new Song("I Gotta Feeling", 8), new Song("Macarena (Bayside Boys Mix)", 9), new Song("Physical", 1), 
                new Song("You Light Up My Life", 2), new Song("Hey Jude", 6)};
        // Song insertSong = new Song("Ascend", 5);
        int bestSoFar = topTenSongs[0].getRating();
        int worstSoFar = topTenSongs[7].getRating();
        String bestTitle = topTenSongs[0].getTitle();
        String worstTitle = topTenSongs[7].getTitle();
        String tied = null;
        // Print song array
        for (Song s : topTenSongs) {
            System.out.println(s.getTitle() + " " + s.getRating());
        }
        // Find the song with the best and worst rating, print them
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
        // Find songs with the rating of 2, print them
        System.out.println("Songs rated at 2: ");
        for (Song s : topTenSongs) {
            if (s.getRating() == 2) {
                tied = s.getTitle();
                System.out.println(tied);
            }
        }
        // Here we are going to delete the song "I Gotta Feeling" and replace contents in a loop so the array is fixed accordingly
        // Note that ratings are not kept between songs but that's not what is required
        String songToDelete = "I Gotta Feeling";
        String songToCopy = null;
        int index = 0;
        int index2 = 0;
        int lastIndex = 9;
        for (int i = 0; i < topTenSongs.length - 1; i++) {
            if (topTenSongs[i].getTitle().equals(songToDelete)) {
                index = i;
                index2 = index + 1;
                songToCopy = topTenSongs[index2].getTitle();
                songToDelete = topTenSongs[index2].getTitle();
                topTenSongs[index].setTitle(songToCopy);
            }
            // If the last song in the array is the same as the one before it, change the song to "null"
            if (topTenSongs[lastIndex].getTitle().equals(topTenSongs[8].getTitle())) {
                topTenSongs[lastIndex].setTitle(null);
                lastIndex = lastIndex - 1;
            }
        }
        System.out.println();
        // Changing last song from "null" to the one before it ("Hey Jude")
        String lastSong = topTenSongs[lastIndex].getTitle();
        topTenSongs[9].setTitle(lastSong);
        // Print out the new song array
        for (Song s : topTenSongs) {
            System.out.println(s.getTitle() + " " + s.getRating());
        }
        // Inserting a new song
        // There are two copies of "Hey Jude", by using lastSong we can avoid getting a null pointer exception and we won't lose any songs either
        // Instructions said to insert a new song into the partially filled array, didn't say ordered or unordered muahaha
        String songToInsert = "Smash Mouth";
        topTenSongs[lastIndex].setTitle(songToInsert);
        lastIndex = lastIndex + 1;
        System.out.println();
        System.out.println();
        for (Song s : topTenSongs) {
            System.out.println(s.getTitle() + " " + s.getRating());
        }
    }
}
