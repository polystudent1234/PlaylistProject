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
    private String title;
    private String artist;
    private int length;
    private boolean like;
    
    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String title, String artist, int length, boolean like)
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
    public String toString()
    {
        return getTitle() + "by" + getArtist() + getLength();
    }
    
    public String getTitle()
    {
        return "\"" + title + "\"";
    } 
    
    public String getArtist()
    {
        return artist;
    }
    
    public int getLength()
    {
        return length;
    }

    public boolean like()
    {
        return like;
    }
    
    public void setLike()
    {
        
    }
}
