package patterns.structural.proxy;

public class ProxyApp {

    public static void main(String[] args) {
        Image image = new ProxyImage("D:/mi/images/my.jpg");
        image.display();
    }
}

