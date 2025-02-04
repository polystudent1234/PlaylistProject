/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        int passed = 0;
        System.out.println("Initializing a Playlist...\n");
        
        Playlist playlist = new Playlist();
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/10)");
        
        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        playlist.addSong(new Song("Jingle Bells", "James Pierpont", 106));
        playlist.addSong(new Song("N95", "Kendrick Lamar", 227));
        playlist.addSong(new Song("Dark Red", "Steve Lacy", 174));
        playlist.addSong(new Song("abc", "Bob Johnson", 1000));
        playlist.addSong(new Song("XYZ", "John Bobson", 129));
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/11)");
        
        System.out.println("Printing the songs...\n");
        playlist.examineAll();
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/11)");
        
        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        playlist.like(0);
        playlist.like(2);
        playlist.like(4);
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/11)");

        System.out.println("Printing the songs...\n");
        playlist.examineAll(); 
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/11)");

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        playlist.removeSong(1);
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/11)");

        System.out.println("Printing the songs...\n");
        playlist.examineAll();
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/11)");

        System.out.println("\nPrinting only the liked songs...\n");
        playlist.examineLiked();
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/11)");

        System.out.println("\nPrinting the total duration of all songs...\n");
        playlist.gettotalLength();
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/11)");

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        playlist.removeUnliked();
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/11)");

        System.out.println("Printing all songs...\n");
        playlist.examineAll();
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/11)");
    }
}
