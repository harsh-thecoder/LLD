package StructuralDesignPattern.FacadeDesignPattern;

public class ImageViewer {
    public void loadImageFile(){
        System.out.println("Loading Image file");
    }

    public void applyScaling(){
        System.out.println("Applying Scaling");
    }

    public void displayImage(){
        System.out.println("Now displaying the Image");
    }
}
