/*
 * Written by: Terry Lowery
 * Date: 5/13/2019
 */
package net.lowerytech.models;

/**
 * The type Album.
 */
public class Album  {
    private int albumId;
    private int artistId;
    private String name;

    /**
     * Instantiates a new Album.
     *
     * @param albumId  the album id
     * @param artistId the artist id
     * @param name     the name
     */
    public Album(int albumId, int artistId, String name) {
        this.albumId = albumId;
        this.artistId = artistId;
        this.name = name;
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
