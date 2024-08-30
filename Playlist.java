package Week1.NotSpotify;

import java.util.ArrayList;

public class Playlist {
    // attributes of the Playlist class; we need an ArrayList of songs
    private String name;
    private ArrayList<Song> songs;

    // constructor to initialize variables
    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // getters and setters for all variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    // addSong method that allows you to add a song to the playlist's ArrayList
    public void addSong(Song song) {
        songs.add(song);
    }

    // removeSong method that allows you to remove a song from the playlist's ArrayList
    public void removeSong(Song song) {
        songs.remove(song);
    }

    // playAllSongs method to display all the songs in the playlist and "play" them
    public void playAllSongs() {
        System.out.println("Now Playing All Songs");
        // for every Song object in the songs array, print the details of the song to "play" it
        for (Song song : songs) {
            System.out.println("Added to Queue: '" + song.getTitle() + "' by " + song.getArtist() + " [" + song.getDuration() + " mins]");
        }
    }
}
