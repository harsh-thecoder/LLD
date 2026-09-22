package BehavirolDesignPattern.IteratorDesignPattern.BadCode;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<String> songs;
    public Playlist(){
        songs = new ArrayList<>();
    }

    public void addSong(String song){
        songs.add(song);
    }

    public void playPlaylist(){
        for(int i=0;i<songs.size();i++){
            System.out.println("Playing song : " + songs.get(i));
        }
    }

}
