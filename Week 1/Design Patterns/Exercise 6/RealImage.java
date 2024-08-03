// RealImage.java
public class RealImage implements Image {
    private String imageURL;

    public RealImage(String imageURL) {
        this.imageURL = imageURL;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image from " + imageURL);
        // Simulate loading image from server
        try {
            Thread.sleep(2000); // Simulating network delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Image loaded from " + imageURL);
    }

    @Override
    public void display() {
        System.out.println("Displaying image from " + imageURL);
    }
}
