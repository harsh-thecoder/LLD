package BehavirolDesignPattern.IteratorDesignPattern.GoodCode;

import java.util.ArrayList;

public class Playlist {
    private ArrayList <String> songs;

    public Playlist(){
        songs = new ArrayList<>();
    }
    ArrayList <String> getSongs(){
        return songs;
    }

    public void addSongs(String song){
        songs.add(song);
    }

    // iterator is just a random name and not a keyword
    public PlaylistIterator iterator(String type){
        switch(type){
            case "normal":
                return new NormalPlaylistIterator(this);
            case "favorite":
                return new FavoritePlaylistIterator(this);
            case "shuffled":
                return new ShuffledPlaylistIterator(this);
            default:
                return null;            
        }
    }
}
