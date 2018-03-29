
/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{
    public static void main() {
        String [] sharingFriends = {"Nevyn", "Richards", "Massey", "Keegan", "Stalin"};
        int [] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        Song [] topTenSongs = {new Song("The Twist"), new Song("Smooth"), new Song("Mack The Knife"), new Song("How Do I Live"), 
                new Song("Party Rock Anthem"), new Song("I Gotta Feeling"), new Song("Macarena (Bayside Boys Mix)"), new Song("Physical"), 
                new Song("You Light Up My Life"), new Song("Hey Jude")};
        int runningTotal = 0;
        int counter = 0;
        int index = SongFinder.findTitle(topTenSongs, "Mack The Knife");
        if (index >=0 ) {
            System.out.println("Found " + topTenSongs[index].getTitle());
        }
        else  {
            System.out.println("Song not found!");
        }

        for (int i = 0; i < sharingFriends.length; i++) {
            System.out.println(sharingFriends[i]);
        }
        for (int total : daysBtwnPurchase) {
            runningTotal = runningTotal + total;
        }
        System.out.println(runningTotal / daysBtwnPurchase.length);
        System.out.println();
        // Setting the price then displaying the song along with it
        for (Song s: topTenSongs)
        {
            s.setPrice(1.00);
            counter += 1;
            // Every third song is discounted by 99 cents
            if (counter == 3) {
                s.setPrice(.01);
                counter = 0;
            }
            System.out.println(s.getTitle() + " " + s.getPrice());
        }
        System.out.println();
        // Showing the first five songs
        for (int i = 0; i < topTenSongs.length && i < 5; i++) {
            System.out.println(topTenSongs[i].getTitle() + " " + topTenSongs[i].getPrice());
        }
        System.out.println();
        // Showing every other song
        for (int i = 0; i < topTenSongs.length; i += 2) {
            System.out.println(topTenSongs[i].getTitle() + " " + topTenSongs[i].getPrice());
        }
        System.out.println();
        // Using for each loop and if statement as well
        for (Song song : topTenSongs) {
            counter += 1;
            if (counter == 2) {
                System.out.println(song.getTitle() + " " + song.getPrice());
                counter = 0;
            }
        }
        System.out.println();
        index = SongFinder.getIndexLastDiscount(topTenSongs, 1.00);
        if (index >= 0 ) {
            System.out.println("Discount found " + topTenSongs[index].getTitle());
        }
        else {
            System.out.println("No songs are discounted");
        }

        System.out.println("--Find last song --");
        index = SongFinder.getIndexLastTitle(topTenSongs);
        if (index >= 0 ) {
            System.out.println("Last title: " + topTenSongs[index].getTitle());
        }
        else {
            System.out.println("You have a blank title!");
        }

        /* change the array
        System.out.println("-BEFORE--");
        for (Song changeSong : topTenSongs) {
        changeSong= new Song("test");
        System.out.println(changeSong.getTitle());
        }
        // show the array
        System.out.println("-AFTER--");
        for (Song showSong : topTenSongs) {
        System.out.println(showSong.getTitle());
        }

        for (int i = 0; i < topTenSongs.length; i++) {
        topTenSongs[i] = new Song("test");
        }
        for (Song showSong : topTenSongs) {
        System.out.println(showSong.getTitle());
        }*/
    }
}
