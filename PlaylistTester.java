/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) 
    {
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
        playlist.addSong(new Song("Symphony No. 2 in C minor (Auferstehung): V. Im Tempo des Scherzos. Wild herausfahrend", "Gustav Mahler, Leonard Bernstein, London Symphony Orchestra, Edinburgh Festival Chorus, Janet Baker, Shelia Armstrong", 2183));
        playlist.addSong(new Song("N95", "Kendrick Lamar", 227));
        playlist.addSong(new Song("Dark Red", "Steve Lacy", 174));
        playlist.addSong(new Song("Sibelius: Violin Concerto in D Minor, Op. 47: I. Allegro moderato", "Jean Sibelius, Itzhak Perlman, Andre Previn, Pittsburgh Symphony Orchestra", 971));
        playlist.addSong(new Song("The Rite of Spring, K15, Pt. 1: VII. Adoration of the Earth (The Sage)", "Igor Stravinsnky, Berliner Philharmoniker, Herbert von Karajan", 25));
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/10)");
        
        System.out.println("Printing the songs...\n");
        playlist.examineAll();
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/10)");
        
        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        playlist.like(playlist.callSong(0), true);
        playlist.like(playlist.callSong(2), true);
        playlist.like(playlist.callSong(4), true);
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/10)");

        System.out.println("Printing the songs...\n");
        playlist.examineAll(); 
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/10)");

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        playlist.removeSong(playlist.callSong(1));
        passed ++;
        System.out.println("Tests passed: " + "(" + passed + "/10)");


        System.out.println("Printing the songs...\n");


        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!


        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds


        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call


        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
    }
}
