package BehavirolDesignPattern.IteratorDesignPattern.GoodCode;

public class FavoritePlaylistIterator implements PlaylistIterator{
    private Playlist playlist;
    private int index;
    public FavoritePlaylistIterator(Playlist playlist){
        this.index = 0;
        this.playlist = playlist;
    }

    @Override 
    public boolean hasNext(){
        while(index < playlist.getSongs().size()){
            if(playlist.getSongs().get(index).contains("Fav")){
                return true;
            }
            index++;
        }
        return false;
    }

    @Override 
    public String next(){
        return (playlist.getSongs().get(index++));
    }

}
