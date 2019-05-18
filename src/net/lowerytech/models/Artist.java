/*
 * Written by: Terry Lowery
 * Date: 5/13/2019
 */
package net.lowerytech.models;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Artist {
    private Album album;
    private int artistId;
    private String name;

    public Artist(Album album, int artistId, String name) {
        this.album = album;
        this.artistId = artistId;
        this.name = name;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getArtistNameSortedReversed(List<Artist> artists) {
        List<String> artistNames = artists.stream()
                .map(a -> a.getName())
                .distinct()
                .collect(Collectors.toList());
        artistNames.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Artist name: " + getName() + "\n"
                + "Album name: " + album.getName() + "\n";
    }
}
