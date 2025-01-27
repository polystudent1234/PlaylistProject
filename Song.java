/**
 * File for a Song class to be used in the Playlist Project
 * @author Max Herman
 * @version 2024-1-24
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    //title
    //author
    //length
    //like status
    private String Name;
    private String Artist;
    private int lengthMinutes;
    private int lengthSeconds;
    private boolean like;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String name, String artist, int minutes, int seconds, boolean likestatus)
    {
        Name = name;
        Artist = artist;
        lengthMinutes = minutes;
        lengthSeconds = seconds;
        like = likestatus;
    }
    
    /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
    */
    public String toString()
    {
        return getName() + "by" + getArtist() + getLength();
    }
    
    public String getName()
    {
        return "\"" + Name + "\"";
    } 
    
    public String getArtist()
    {
        return Artist;
    }
    
    public String getLength()
    {
        return "(" + lengthMinutes + ":" + lengthSeconds + ")";
    }

    public boolean like()
    {
        return like;
    }
}
