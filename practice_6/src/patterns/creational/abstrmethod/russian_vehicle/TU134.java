package patterns.creational.abstrmethod.russian_vehicle;

import patterns.creational.abstrmethod.Aircraft;

public class TU134 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("The flight duration of the TU134 is 8 hours");
    }
}
