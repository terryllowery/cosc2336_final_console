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

public class MusicDB {
    private static String DBURL = "jdbc:sqlite:music_artists.sqlite";
    private static Connection getConnection(String DBURL) throws SQLException {
        Connection connection = DriverManager.getConnection(DBURL);

        return connection;
    }

    public static List<Artist> getAll() {
        List<Artist> products = new ArrayList<>();
        String sql = "SELECT art.ArtistID artistID," +
                " art.Name artistName," +
                " alb.AlbumID albumID," +
                " alb.Name albumName" +
                " FROM Artists art" +
                " INNER JOIN Albums alb ON art.ArtistID = alb.ArtistID";

        try {
            Connection connection = getConnection(DBURL);
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

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