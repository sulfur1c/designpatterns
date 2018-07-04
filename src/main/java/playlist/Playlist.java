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
        this.playlist.stream().forEach(song -> song.play());
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.playlist.stream().forEach(song -> song.setPlaybackSpeed(speed));
    }

    @Override
    public String getName() {
        return this.playlistName;
    }

    public void add(IComponent component) {
        this.playlist.add(component);
    }

    public void remove(IComponent component) {
        this.playlist.remove(component);
    }

}
