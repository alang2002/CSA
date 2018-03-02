public class SongFinder
{
    public static int findTitle(Song[] topTenSongs, String target){
        for (int i = 0; i < topTenSongs.length; i++){
            String word = topTenSongs[i].getTitle();
            //System.out.println(word + "-" + target);
            if (word.equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int getIndexLastDiscount(Song[] topTenSongs, double compare){
        if (topTenSongs == null) return -1;
        // Problem: It goes through the for loop and doesn't return the index to ArrayMediaLib so we only get the last one at "return found;", which is "You Light Up My Life"
        int found = -1;
        for (int i = 0; i < topTenSongs.length - 1; i++) {
            if (topTenSongs[i].getPrice() < compare) {
                found = i;
            }
            else {
                found = -1; // to show none found
            }
        }
        return found;
    }

    /**
     * Search through all songs, checking for blank titles.
     * If blank title is found, return -1 to indicate an error.
     * If all titles are "well-defined", return the last index in the array.
     */
    public static int getIndexLastTitle(Song[] songs)
    {
        int i = -1;
        if (songs == null) {
            return -1;
        }
        for (i = 0; i < songs.length - 1; i++) {
            // skip if no title
            if (songs[i].getTitle().equals("")) {
                return -1;
            }
        }
        return i;
    }
}