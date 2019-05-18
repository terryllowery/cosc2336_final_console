/*
 * Written by: Terry Lowery
 * Date: 5/13/2019
 */
package net.lowerytech.models;

public class Album  {
    private int albumId;
    private int artistId;
    private String name;

    public Album(int albumId, int artistId, String name) {
        this.albumId = albumId;
        this.artistId = artistId;
        this.name = name;
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return getName() + "\n";
    }

}
