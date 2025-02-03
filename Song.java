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
    /**
      * instance variables: title, artist, length, like
    */
    private String title;
    private String artist;
    private int length;
    private boolean like;
    
    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String title, String artist, int length)
    {
        this.title = title;
        this.artist = artist;
        this.length = length;
        like = false;
    }
    
    /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
    */
   
    /**
      * toString Method
      * @return most of the information of any given song formatted like:
      * "title" by Artist (minutes:seconds)
    */
    public String toString()
    {
        return getTitle() + " by " + getArtist() + " (" + (getLength()/60) + ":" + getLength() + (getLength()/60) + ")";
    }
    // need to do math to get the right time, as getLength() is in seconds
    
    /**
      * getTitle Method
      * @return the title in quotation marks: "title"
    */
    public String getTitle()
    {
        return "\"" + title + "\"";
    } 
    // special formatting to put quotes
    
    /**
      * get Artist method
      * @return the name of the artist as a string
    */
    public String getArtist()
    {
        return artist;
    }
    
    /**
      * getLength method
      * @return the length of the song in seconds as an integer
    */
    public int getLength()
    {
        return length;
    }

    /**
      * like method
      * @return the like status of the song (true/false) as a boolean
    */
    public boolean like()
    {
        return like;
    }
    
    /**
      * setlike method
      * mutator that allows the Playlist class to alter the like status of 
      * a given song
      * @param boolean likestatus
    */
    public void setLike(boolean likestatus)
    {
        like = likestatus;
    }
    // just changes to specified stAtus, even if the same
}
