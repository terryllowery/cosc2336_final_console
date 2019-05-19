/*
 * Written by: Terry Lowery
 * Date: 5/13/2019
 */
package net.lowerytech.db;

import net.lowerytech.models.Album;
import net.lowerytech.models.Artist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <code>MusicDb</code> class connects to database and returns all the fields from the
 * database
 */
public class MusicDB {
    //db url
    private static String DBURL = "jdbc:sqlite:music_artists.sqlite";
    // create a connection to the db and return it as a connection
    private static Connection getConnection(String DBURL) throws SQLException {
        return DriverManager.getConnection(DBURL);
    }

    /**
     * <code>getAll</code> class calls the database using a prepared sql statement
     * then loops through the result set creating a list of artists
     * @return the list of artists including their albums
     */
    public static List<Artist> getAll() {
        // used to store the list of artist to return to calling code
        List<Artist> products = new ArrayList<>();
        // select all artists and albums, artists in descending order and albums in ascending order
        String sql = "SELECT art.ArtistID artistID," +
                " art.Name artistName," +
                " alb.AlbumID albumID," +
                " alb.Name albumName" +
                " FROM Artists art" +
                " INNER JOIN Albums alb ON art.ArtistID = alb.ArtistID" +
                " ORDER BY art.Name DESC," +
                " alb.Name ASC ";
        // using try/catch to get a connection, execute sql statement and add to the artist list
        try {
            Connection connection = getConnection(DBURL);
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            // loop through result set until no more results
            while (rs.next()) {
                Album a = new Album(rs.getInt("albumID"), rs.getInt("artistID"), rs.getString("albumName"));
                Artist p = new Artist(a, rs.getInt("artistID"), rs.getString("artistName"));

                products.add(p);
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return products;
    }


}
