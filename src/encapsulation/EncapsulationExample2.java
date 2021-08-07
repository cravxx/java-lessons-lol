package encapsulation;

import static fallk.logmaster.HLogger.log;

public class EncapsulationExample2 {

    public static void main(String[] args) {
        MyEPoint mp = new MyEPoint(0,1,2);
        log(mp.getX() + " " + mp.getY() + " " + mp.getZ());
    }

}
