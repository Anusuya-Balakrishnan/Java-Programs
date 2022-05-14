/*
Create a program that implements a playlist for songs
Create a Song class having Title and Duration for a song.
 The program will have an Album class containing a list of songs.
 The albums will be stored in an ArrayList
Songs from different albums can be added to the playlist and will appear in the list in the order
they are added.
Once the songs have been added to the playlist, create a menu of options to:-
Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
List the songs in the playlist
A song must exist in an album before it can be added to the playlist (so you can only play songs that you own).
Hint:  To replay a song, consider what happened when we went back and forth from a city before we
started tracking the direction we were going.
 As an optional extra, provide an option to remove the current song from the playlist
 (hint: listiterator.remove()


 */
package Section8Array.Playlist;

import java.util.*;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String songTitle, double songDuration) {
        Song songs = findSong(songTitle);
        if (songs == null) {
            this.songs.add(new Song(songTitle, songDuration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> thePlayList) {
              int value=trackNumber-1;
            if (value>=0 && value<songs.size()) {
                Song songs = this.songs.get(value);
                thePlayList.add(songs);
                return true;
            }
        
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> thePlayList) {
        Song songs = findSong(songTitle);
        if (songs != null) {
            thePlayList.add(songs);
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            String titleSong = songs.get(i).getTitle();
            if (titleSong.equals(title)) {
                return songs.get(i);
            }
        }
        return null;
    }
}
