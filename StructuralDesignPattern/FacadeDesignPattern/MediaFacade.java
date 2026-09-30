package StructuralDesignPattern.FacadeDesignPattern;

public class MediaFacade {
    private MusicPlayer musicPlayer;
    private VideoPlayer videoPlayer;
    private ImageViewer imageViewer;

    public MediaFacade(){
        this.musicPlayer = new MusicPlayer();
        this.videoPlayer = new VideoPlayer();
        this.imageViewer = new ImageViewer();
    }

    public void performAction(String action){
        switch (action.toLowerCase()) {
            case "playmusic":
                musicPlayer.initializeAudioDrivers();
                musicPlayer.decodeAudio();
                musicPlayer.startPlayBack();
                break;
            case "playvideo":
                videoPlayer.setupRenderingEngine();
                videoPlayer.loadVideoFile();
                videoPlayer.playVideo();    
            case "viewimage":
                imageViewer.loadImageFile();
                imageViewer.applyScaling();
                imageViewer.displayImage();    
            default:
                System.out.println("Invalid Action");
                break;
        }
    }
}
