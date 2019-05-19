package net.lowerytech.app;

import net.lowerytech.console.Console;
import net.lowerytech.db.MusicDB;
import net.lowerytech.models.Artist;


import java.util.List;
import java.util.stream.Collectors;

/**
 * <code>MusicApp</code> is main class to application
 * calls MusicDB.getAll() to get all the artists/albums to store to a string
 * then using lambdas to stream, map, and collect according to wait we are looking for
 */
public class MusicApp {

    /**
     * The entry point of application.
     *
     * @param args the input arguments - not used
     */
    public static void main(String[] args) {
        // Create new MusicDb object to call the database
        MusicDB musicDB = new MusicDB();
        // Get all artist and albums from database
        List<Artist> artists = musicDB.getAll();
        // get a list of strings to store artists in reverse order
        List<String> justName = artists.stream()
                .map(a -> a.getName())
                .distinct()
                .collect(Collectors.toList());

        // Print Artists in reverse order
        Console.printHeader("Artists");
        artists.stream()
                .map(a -> a.toString())
                .distinct()
                .forEach(System.out::println);

        // Print a blank line
        System.out.println();
        Console.printHeader("Albums");
        // create a lists of album names by streaming the artists list
        // and calling the getAlbum to string
        List<String> albumNames = artists.stream()
                .map(a -> a.getAlbum().toString())
                .collect(Collectors.toList());
        // print those album names
        albumNames.stream()
                .sorted()
                .forEach(System.out::println);

        // Artist and album by name
        System.out.println();
        Console.printHeader("Albums by Artist");
        // for each name in artist name
        for(String name : justName){
            // print the artist name
            System.out.println(name);
            System.out.println();
            // loop through each artist name
            for(Artist a : artists){
                // if the artist name from outer loop matches the inner loop
                if(a.getName().equalsIgnoreCase(name)) {
                    // then print the album name
                    System.out.printf("\t\t%s\n",a.getAlbum().getName());
                    System.out.println();
                }
            }
        }



    }
}
