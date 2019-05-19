package net.lowerytech.app;

import net.lowerytech.console.Console;
import net.lowerytech.db.MusicDB;
import net.lowerytech.models.Album;
import net.lowerytech.models.Artist;

import java.sql.Connection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Music app.
 */
public class MusicApp {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
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
        List<String> albumNames = artists.stream()
                .map(a -> a.getAlbum().toString())
                .collect(Collectors.toList());
        albumNames.stream()
                .sorted()
                .forEach(System.out::println);

        // Artist and album by name
        System.out.println();
        Console.printHeader("Albums by Artist");
        for(String name : justName){
            System.out.println(name);
            System.out.println();
            for(Artist a : artists){
                if(a.getName().equalsIgnoreCase(name)) {
                    System.out.printf("\t\t%s\n",a.getAlbum().getName());
                    System.out.println();
                }
            }
        }



    }
}
