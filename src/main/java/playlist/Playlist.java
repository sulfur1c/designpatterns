package main.java.playlist;

import java.util.ArrayList;

public class Playlist implements IComponent{

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }
    @Override
    public void play() {

    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.playlist.stream().forEach(song -> song.setPlaybackSpeed(speed));
    }

    @Override
    public String getName() {
        return this.playlistName;
    }

    public void add(Song song) {
        this.playlist.add(song);
    }

    public void add(Playlist playList) {
        playList.playlist.stream().forEach(song -> this.playlist.add(song));
    }

    public void remove(Playlist playList) {
        this.playlist.remove(playList);
    }

}
