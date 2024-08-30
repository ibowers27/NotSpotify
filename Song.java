package Week1.NotSpotify;

public class Song {
    // attributes in Song class that will represent qualities of each song
    private String title;
    private String artist;
    private double duration;

    // constructor to initialize variables
    public Song(String title, String artist, double duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // getters and setters for each attribute
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
