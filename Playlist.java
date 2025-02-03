import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;
    // instance varable to reference later


     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
      // I assume the additional methods happen later
    public Playlist()
    {
        playlist = new ArrayList<Song>();
    }

      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
      
    /**
      * addSong method
      * adds a new song and relevant information
      * @param String title, String artist, int length
    */
    public void addSong(String title, String artist, int length)
    {
        playlist.add(new Song(title, artist, length));
    }
    
    /**
      * addSong something
    */
    public void addSong(Song newSong)
    {
        playlist.add(newSong);
    }
    // overloaded to add both ways

    public Song callSong(int num)
    {
        return playlist.get(num);
    }
    // to reference the selected song as a Song in the tester ^
    
    /**
      * removeSong method
      * removes a given song from the playlist
      * @param Song Song
    */
    public void removeSong(Song Song)
    {
        playlist.remove(Song);
    }
    
    /**
      * like method
      * alters the like status of a song
      * @param boolean likestatus
    */
    public void like(Song song, boolean likestatus)
    {
        song.setLike(likestatus);
    }
    // just have to reverse if it is liked or not ("alter the like status")
    
    /**
      * another remove song method????
    */
    public void removeSong(String Name)
    {
        for (int i = playlist.size() - 1; i >= 0; i--)
        {
            if (playlist.get(i).getTitle() == Name)
            {
                playlist.remove(i);
            }
        }
    }
    // remove by name
    
    /**
      * examineAll method
    */
    public void examineAll()
    {
        for (int i = playlist.size() - 1; i >= 0; i--)
        {
            System.out.println(playlist.get(i).toString());
        }
    }
    // print them all
    
    /**
      * examineLiked method
    */
    public void examineLiked()
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            if (playlist.get(i).like())
            {
                System.out.println(playlist.get(i).toString());
            }
        }
    }
    
    /**
      * removeUnliked method
      * removes all unliked songs on the playlist
    */
    public void removeUnliked()
    {
        for (int i = playlist.size() - 1; i >= 0; i--)
        {
            if (playlist.get(i).like() == false)
            {
                playlist.remove(i);
            }
        }
    }
    
    
    
    
    
    
    
}
