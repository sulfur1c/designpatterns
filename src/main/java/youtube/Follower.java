package main.java.youtube;

public class Follower implements Observer {

    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String status) {
        play();
    }

    private void play() {
        System.out.println("Playing ...");
    }
}
