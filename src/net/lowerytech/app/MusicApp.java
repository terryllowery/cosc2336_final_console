package net.lowerytech.app;

import net.lowerytech.db.MusicDB;
import net.lowerytech.models.Artist;

import java.util.List;

public class MusicApp {

    public static void main(String[] args) {
        MusicDB musicDB = new MusicDB();
        List<Artist> artists = musicDB.getAll();

        for(Artist a : artists) {
            System.out.println(a.toString());
        }


    }
}
