package patterns.structural.proxy;

public class RealImage implements Image{
    private String directory;

    public RealImage(String directory) {
        this.directory = directory;
        load();
    }

    public void load(){
        System.out.println("Загрузка файла: " + directory);
    }


    @Override
    public void display() {
        System.out.println("Просмотр файла: " + directory);
    }
}
