package Week1.NotSpotify;

import java.util.ArrayList;

public class User {
    // attributes of the User class; includes an ArrayList for the playlists each user has
    private String username;
    private ArrayList<Playlist> playlists;

    // constructor to initialize variables
    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

    // getters and setters for each attribute
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    // method to create/add a playlist of type pop, rock, or jazz
    public void createPlaylist(String name, String type) {
        // create the playlist with the correct name according to which type the user assigns
        Playlist playlist = null;
        if (type.equals("pop")) {
            playlist = new PopPlaylist(name);
        }
        else if (type.equals("rock")) {
            playlist = new RockPlaylist(name);
        }
        else if (type.equals("jazz")) {
            playlist = new JazzPlaylist(name);
        }

        playlists.add(playlist);
        System.out.println("New Playlist Created: " + name + " (" + type + ")");
    }

    // method to delete a specific playlist
    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
        System.out.println(playlist.getName() + " has been deleted.");
    }

    // method to add a song to a specified playlist
    public void addSongToPlaylist(Playlist playlist, Song song) {
        playlist.addSong(song);
        System.out.println(song.getTitle() + " has been added to " + playlist.getName());
    }

    // method to remove a song from a specified playlist
    public void removeSongFromPlaylist(Playlist playlist, Song song) {
        playlist.removeSong(song);
        System.out.println(song.getTitle() + " has been removed from " + playlist.getName());
    }
}
