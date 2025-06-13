// . You are developing a media player application. 
// There is a base class called MediaPlayer, which has methods like play(), pause(), and stop(). 
// The VideoPlayer class inherits from MediaPlayer and adds methods like rewind() and fastForward().
//  Additionally, there is an interface called Playlist, which defines methods like addSong() and removeSong(). 
// The VideoPlayer class implements the Playlist interface. 
// Implement the classes and demonstrate inheritance with interface by creating objects of the VideoPlayer class 
// and calling its methods as well as the interface methods.


// Base class: MediaPlayer
class MediaPlayer {
    public void play() {
        System.out.println("Playing media...");
    }

    public void pause() {
        System.out.println("Pausing media...");
    }

    public void stop() {
        System.out.println("Stopping media...");
    }
}

// Interface: Playlist
interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

// Subclass: VideoPlayer inherits from MediaPlayer and implements Playlist
class VideoPlayer extends MediaPlayer implements Playlist {
    private java.util.List<String> songs = new java.util.ArrayList<>();

    public void rewind() {
        System.out.println("Rewinding video...");
    }

    public void fastForward() {
        System.out.println("Fast forwarding video...");
    }

    public void addSong(String song) {
        songs.add(song);
        System.out.println("Added song: " + song);
    }

    public void removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println("Removed song: " + song);
        } else {
            System.out.println("Song not found: " + song);
        }
    }

    public void showPlaylist() {
        System.out.println("Current Playlist:");
        for (String song : songs) {
            System.out.println("- " + song);
        }
    }
}

// Main class to demonstrate the functionality
public class MediaApp {
    public static void main(String[] args) {
        VideoPlayer vp = new VideoPlayer();

        // MediaPlayer methods
        vp.play();
        vp.pause();
        vp.stop();

        // VideoPlayer-specific methods
        vp.rewind();
        vp.fastForward();

        // Playlist interface methods
        vp.addSong("Song A");
        vp.addSong("Song B");
        vp.removeSong("Song A");
        vp.removeSong("Song X"); // Try removing a non-existing song

        // Display playlist
        vp.showPlaylist();
    }
}
