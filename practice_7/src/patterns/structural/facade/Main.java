package patterns.structural.facade;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.copy();
    }
}

class Computer{ // Этот класс является фасадом(тк содержит всякие комбинации и скрывает все наши действия)
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    void copy(){
        power.on();
        dvdRom.insertDVD();
        hdd.copyFromDVD(dvdRom);
    }
}

class Power{

    void on(){ System.out.println("Питание включено"); }
    void off(){ System.out.println("Питание выключено"); }
}

class DVDRom{
    private boolean data = false;

    public boolean getData(){
        return data;
    }

    void insertDVD(){
        System.out.println("Диск вставлен");
        data = true;
    }

    void pullOutDVD(){
        System.out.println("Вытащили диск");
        data = false;
    }

}

class HDD{
    void copyFromDVD(DVDRom dvdRom){
        if(dvdRom.getData()){
            System.out.println("Происходит запись данных на dvd");
        }
        else{
            System.out.println("Вставьте диск");
        }
    }

}

