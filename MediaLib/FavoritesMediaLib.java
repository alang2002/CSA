
/**
 * Write a description of class FavoritesMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FavoritesMediaLib
{
    public static void main()
    {
        String line = MediaFile.readString();
        int start = 0;
        int pipe = line.indexOf("|", start);
        System.out.println("Top Favorite Songs");
        System.out.println("----------------");
                
        /*
         * FUNCTIONAL CODE THAT PRINTS OUT THE SONGS AND RATINGS EACH ON A DIFFERENT LINE.
        
        while (loop) {
            String song = line.substring(start, pipe);
            System.out.println(song);
            start = pipe+1;
            pipe = line.indexOf("|", start);
            if (pipe < 0)
                loop = false;
        }
        
        
       
        
        * 
        * CODE THAT WILL NOT PRINT ANYTHING BECAUSE IT DELETES TOKENS BEFORE PRINTING (for 28c).
        * 
        
        
       
        while (loop) {
            String song = line.substring(start, pipe);
            song = song.substring(0,0);
            System.out.println(song);
            start = pipe+1;
            pipe = line.indexOf("|", start);
            if (pipe < 0)
                loop = false;
        }
        
        
       
        
        * 
        * IF YOU HAD 100 SONGS, THIS WOULD PRINT ALL OF THEM OUT. HOWEVER IT PRINTS AN ERROR WHEN RUNNING BECAUSE I DO NOT HAVE 100 SONGS. :( 
        * 
        *
       
        for (int i = 100; i > 0; i--) {
           String song = line.substring(start, pipe);
           System.out.println(song);
           start = pipe+1;
           pipe = line.indexOf("|", start);
        }  
       
        */
        
        for (int i = 7; i > 0; i--) {
           String song = line.substring(start, pipe);
           int songRating = Integer.valueOf(song.substring(song.length()-1, song.length()));
           //Puts the rating in parantheses
           song = song.substring(0, song.length()-1) + "(" + song.substring(song.length()-1) + ")";
           start = pipe+1;
           pipe = line.indexOf("|", start);
           
           if(songRating >= 4) {
               System.out.println(song);  
           }
        }
       
        MediaFile.saveAndClose();
    }
}
