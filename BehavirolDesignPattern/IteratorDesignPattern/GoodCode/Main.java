package BehavirolDesignPattern.IteratorDesignPattern.GoodCode;

public class Main {
    public static void main(String args[]){
        Playlist playlist = new Playlist();
        playlist.addSongs("Darkhaast");
        playlist.addSongs("Jaise tu hai paas mere");
        playlist.addSongs("Aise na jao piya my Fav");
        playlist.addSongs("Kyu tum samajh paae nahi");
        
        PlaylistIterator normalIterator = playlist.iterator("normal");
        System.out.println("Normal Songs : ");
        while(normalIterator.hasNext()) {
            System.out.println("Currently Playing the song : " + normalIterator.next());
        }
        
        System.out.println("\nShffled Songs : ");
        PlaylistIterator shuffledIterator = playlist.iterator("shuffled");
        while(shuffledIterator.hasNext()){
            System.out.println("Currently Playing the song : " + shuffledIterator.next());
        }
        
        System.out.println("\nFavorite Songs : ");
        PlaylistIterator favoriteIterator = playlist.iterator("favorite");
        while(favoriteIterator.hasNext()){
             System.out.println("Currently Playing the song : " + favoriteIterator.next());
        }
    }
}
