
/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    public static void main()
    {
    /*    for (int i = 8; i > 0; i--) {
        System.out.println(MediaFile.readString());
    }*/
    
    String songInfo = MediaFile.readString();
    while (songInfo != null)
    {
        int pipe = songInfo.indexOf("|"); 
        String title = songInfo.substring(0, pipe);
        String rating = songInfo.substring(pipe + 1);
        System.out.println("Title: " + title + "\nRating: " + rating);
        songInfo = MediaFile.readString();
    }
    }
}
