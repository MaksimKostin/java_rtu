package patterns.creational.abstrmethod.american_vehicle;

import patterns.creational.abstrmethod.Aircraft;

public class Boeing777 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("The flight duration of the Boeing777 is 9 hours");
    }
}
