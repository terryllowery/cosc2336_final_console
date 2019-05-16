
1. Use proper statement indentation and meaningful variable names in the code.
2. Add a multi-line description of this application that also includes your name and the date written at the beginning of the code.
3. Add appropriate descriptive comments to each line of code you add to the project explaining why the code is in the application.
## Application 1:

  4. Create an application that lists the artists, albums, and albums by artist from the tables in a database. Your instructor has provided you with a database file (music_artists.sqlite) that contains tables named Artists and Albums in this week's module. These tables store the data for the artists and the albums for each artist.
  
  
### Console Display Illustrated
```bash
Artist and Album Listing

Artists

-------

The Beatles

John Prine

Elvis Presley

 

Albums

------

Elvis 30 #1 Hits

Elvis at Sun

John Prine

Revolver

Rubber Soul

Sgt. Pepper's Lonely Hearts Club Band

Sweet Revenge

The White Album

 

Albums by Artist

----------------

The Beatles

        Revolver

        Rubber Soul

        Sgt. Pepper's Lonely Hearts Club Band

        The White Album

John Prine

        John Prine

        Sweet Revenge

Elvis Presley

        Elvis 30 #1 Hits

        Elvis at Sun
 ```

Specifications

1. Create two classes named Artist and Album that you can use to create objects that store the data for artists and albums. The Artist object should store a list of all Album objects that are related to the artist.

2. Create a class named MusicDB with methods that get a connection to the database and return a list of Artist objects that contain the data for all artists and their albums.

3. Sort the artists names in descending sequence (Z to A).

4. Sort the album names in ascending sequence (A to Z).

5. Create a class with a main() method that uses the Artist, Album, and MusicDB classes to display a list of the artists, a list of the albums, and a list of the albums by artist.

6. If the application encounters any exceptions, it should display them on the console."# cosc2336_final_console" 
