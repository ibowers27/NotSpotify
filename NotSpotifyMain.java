package Week1.NotSpotify;

// test class for !Spotify
public class NotSpotifyMain {
    public static void main(String[] args) {
        // creates 3 new Song objects with associated names, artists, and durations
        Song song1 = new Song("Juna", "Clairo", 3.25);
        Song song2 = new Song("CHIHIRO", "Billie Eilish", 5);
        Song song3 = new Song("California", "Chappell Roan", 3.33);

        // creates a new user for the application
        User user = new User("ivy");

        System.out.println("Now logged in as: " + user.getUsername());
        System.out.println(" ");

        // creates a new pop playlist under the new user
        user.createPlaylist("Chill Pop", "pop");

        // assigns the playlist to a variable popPlaylist
        Playlist popPlaylist = user.getPlaylists().get(0);

        // adds all 3 songs to the pop playlist
        user.addSongToPlaylist(popPlaylist, song1);
        user.addSongToPlaylist(popPlaylist, song2);
        user.addSongToPlaylist(popPlaylist, song3);

        // play all the songs in the pop playlist
        popPlaylist.playAllSongs();

        System.out.println(" ");

        // creates a new rock playlist
        user.createPlaylist("Rock Playlist", "rock");

        // assigns the rock playlist to a variable
        Playlist rockPlaylist = user.getPlaylists().get(1);

        // adds a song to the rock playlist
        user.addSongToPlaylist(rockPlaylist, song2);

        // play all songs in the rock playlist
        rockPlaylist.playAllSongs();

        // removes a specified song from the rock playlist
        user.removeSongFromPlaylist(rockPlaylist, song2);

        // deletes the rock playlist
        user.deletePlaylist(rockPlaylist);

        System.out.println(" ");

        // creates a new jazz playlist
        user.createPlaylist("Jazz Playlist", "jazz");

        // assigns a variable to the jazz playlist
        Playlist jazzPlaylist = user.getPlaylists().get(1);

        // plays all the songs in the jazz playlist (there are none)
        jazzPlaylist.playAllSongs();
    }
}
