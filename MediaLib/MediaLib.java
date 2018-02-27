
/**
 * Cyka blyat
 *
 * @author Aaron Lang/Dalton Hook
 * @version 1/19/2018
 */
public class MediaLib
{
    public static void main()
    {
        double totalCost = 0.0;
        int numSongs = 0;
        int totalRatings = 0;
        double averageCost = 0.0;
        double averageRating = 0.0;

        System.out.println("Welcome to your Media Library");
        System.out.println();
        
        /*
        testing a calculation:
        double testVal = 109.41;
        double testResult  = testVal / 10;
        System.out.println("Testing Result:");
        System.out.println(testResult);
         */
        
        Song song1 = new Song("Soviet Union National Anthem", 0.99, 5);
        
        Song song2 = new Song("The Communist Manifesto Audiobook", 0.99, 4);
        
        Song song3 = new Song("Thriller", 1.19, 3);
        
        Song song4 = new Song("Dance Till You're Dead", 1.29, 5);
        
        Song song5 = new Song("Generic Mexican Song", 1.00, 1);
        
        Song song6 = new Song("Pumped Up Kicks", 1.01, 2);
        
        Song song7 = new Song("Schism", 1.29, 5);
        
        MediaFile.writeString(song1.getTitle() + " " + song1.getRating());
        
        MediaFile.writeString(song2.getTitle() + " " + song2.getRating());
        
        MediaFile.writeString(song3.getTitle() + " " + song3.getRating());

        MediaFile.writeString(song4.getTitle() + " " + song4.getRating());
        
        MediaFile.writeString(song5.getTitle() + " " + song6.getRating());

        MediaFile.writeString(song6.getTitle() + " " + song6.getRating());

        MediaFile.writeString(song7.getTitle() + " " + song7.getRating());
        MediaFile.saveAndClose();
        
        
        Song[] songs = {song1, song2, song3, song4, song5, song6, song7};
        for (Song song : songs) {
            totalCost += song.getPrice();
            totalRatings += song.getRating();
            numSongs++;
            System.out.println(song.getTitle() + ", " + song.getPrice() + ", " + song.getRating());
        }
        averageCost = totalCost / numSongs;
        averageRating = totalRatings / numSongs;
        System.out.println();
        System.out.println("Total cost: " + totalCost);
        System.out.println("Total ratings: " + totalRatings);
        System.out.println("Average cost: " + averageCost);
        System.out.println("Average rating: " + averageRating);
        
        /* Movies and book
        movies1.setName("Soviets In Arms"); 
        System.out.println(movies1.getName());
        movies1.setScore(100);
        System.out.println(movies1.getScore());
        movies1.setDuration(141);
        movies1.printDuration();

        book1.setBTitle("The Communist Manifesto");
        System.out.println(book1.getBTitle());
        book1.setReview(100);
        System.out.println(book1.getReview());
        */
    }
}
