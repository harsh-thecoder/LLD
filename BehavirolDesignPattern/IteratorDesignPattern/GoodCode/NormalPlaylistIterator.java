package BehavirolDesignPattern.IteratorDesignPattern.GoodCode;

public class NormalPlaylistIterator implements PlaylistIterator{
    private Playlist playlist;
    private int index;
    public NormalPlaylistIterator(Playlist playlist){
        this.index = 0;
        this.playlist = playlist;
    }

    @Override 
    public boolean hasNext(){
        return (index < playlist.getSongs().size());
    }

    @Override 
    public String next(){
        return (playlist.getSongs().get(index++));
    }
}
