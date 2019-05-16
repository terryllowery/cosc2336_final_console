package net.lowerytech.app;

import net.lowerytech.console.Console;
import net.lowerytech.db.MusicDB;
import net.lowerytech.models.Artist;

import java.util.List;
import java.util.stream.Collectors;

public class MusicApp {

    public static void main(String[] args) {
        MusicDB musicDB = new MusicDB();
        List<Artist> artists = musicDB.getAll();

        Console.printHeader("Artists");
        List<String> artistNames = artists.stream()
                .map(a -> a.getName())
                .distinct()
                .collect(Collectors.toList());
        artistNames.stream()
                .forEach(System.out::println);

        System.out.println();
        Console.printHeader("Albums");
        List<String> albumNames = artists.stream()
                .map(a -> a.getAlbum().getName())
                .collect(Collectors.toList());
        albumNames.stream()
                .forEach(System.out::println);




    }
}