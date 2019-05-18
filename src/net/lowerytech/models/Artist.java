/*
 * Written by: Terry Lowery
 * Date: 5/13/2019
 */
package net.lowerytech.models;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Artist.
 */
public class Artist  {
    private Album album;
    private int artistId;
    private String name;

    /**
     * Instantiates a new Artist.
     */
    public Artist() {
        this.album = null;
        this.artistId = 0;
        this.name = "";
    }

    /**
     * Instantiates a new Artist.
     *
     * @param album    the album
     * @param artistId the artist id
     * @param name     the name
     */
    public Artist(Album album, int artistId, String name) {
        this.album = album;
        this.artistId = artistId;
        this.name = name;
    }

    /**
     * Gets album.
     *
     * @return the album
     */
    public Album getAlbum() {
        return album;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return getName() + "\n";
    }

}
