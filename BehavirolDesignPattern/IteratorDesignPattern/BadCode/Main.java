package BehavirolDesignPattern.IteratorDesignPattern.BadCode;

/*
    In this Implementation if we want to add any customization then alot of if else cases have to be there
*/
public class Main {
   public static void main(String args[]){
        Playlist playList = new Playlist();
        playList.addSong("Kuch Kuch hota hai");
        playList.addSong("Darkhaast");
        playList.playPlaylist();
   }
}
