
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
        Song [] topTenSongs = {new Song("The Twist"), new Song("Smooth"), new Song("Mack The Knife"), new Song("How Do I Live"), new Song("Party Rock Anthem"), 
                new Song("I Gotta Feeling"), new Song("Macarena (Bayside Boys Mix)"), new Song("Physical"), new Song("You Light Up My Life"), new Song("Hey Jude")};
        int runningTotal = 0;
        for (int i = 0; i < sharingFriends.length; i++) {
            System.out.println(sharingFriends[i]);
        }
        for (int total : daysBtwnPurchase) {
            runningTotal = runningTotal + total;
        }
        System.out.println(runningTotal / daysBtwnPurchase.length);
        System.out.println();
        for (Song s: topTenSongs)
        {
            System.out.println(s.getTitle());
        }

        // change the array
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
    }
}
