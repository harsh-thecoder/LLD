package BehavirolDesignPattern.IteratorDesignPattern.GoodCode;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffledPlaylistIterator implements PlaylistIterator {
      private int index;
      ArrayList <String> shuffledSongsList;
      public ShuffledPlaylistIterator(Playlist playlist){
           this.index = 0;
           this.shuffledSongsList = new ArrayList<>(playlist.getSongs()); // this creates new array which has exact same elements
           Collections.shuffle(shuffledSongsList);
      }

      @Override 
      public boolean hasNext(){
           return (index < shuffledSongsList.size()); 
      }

      @Override 
      public String next(){
            return (shuffledSongsList.get(index++));
      }
}
