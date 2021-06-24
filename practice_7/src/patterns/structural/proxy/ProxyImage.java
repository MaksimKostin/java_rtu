package patterns.structural.proxy;

public class ProxyImage implements Image{
    private String directory;
    RealImage image;

    public ProxyImage(String directory) {
        this.directory = directory;
    }

    @Override
    public void display() {
        if(image == null){
            image = new RealImage(directory);
        }
        image.display();
    }
}
