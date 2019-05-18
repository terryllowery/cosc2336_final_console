/*
 * Written by: Terry Lowery
 * Date: 5/13/2019
 */
package net.lowerytech.models;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Artist  {
    private Album album;
    private int artistId;
    private String name;

    public Artist() {
        this.album = null;
        this.artistId = 0;
        this.name = "";
    }

    public Artist(Album album, int artistId, String name) {
        this.album = album;
        this.artistId = artistId;
        this.name = name;
    }

    public Album getAlbum() {
        return album;
    }

    public String getName() {
        return name;
    }

    public static List<String> getArtistNameSortedReversedUnique(List<Artist> artists) {
        List<String> artistNames = artists.stream()
                .map(a -> a.getName())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return artistNames;
    }

    @Override
    public String toString() {
        return getName() + "\n";
    }

}
