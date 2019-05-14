/*
 * Written by: Terry Lowery
 * Date: 5/13/2019
 */
package net.lowerytech.models;

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

    @Override
    public String toString() {
        return "Artist{" +
                "album=" + album +
                ", artistId=" + artistId +
                ", name='" + name + '\'' +
                '}';
    }
}
