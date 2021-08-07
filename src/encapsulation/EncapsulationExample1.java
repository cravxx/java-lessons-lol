package encapsulation;

import static fallk.logmaster.HLogger.log;

public class EncapsulationExample1 {

    public static void main(String[] args) {
        MyPoint mp = new MyPoint(0,1,2);
        log(mp.x + " " + mp.y + " " + mp.z);
        mp.y = 10;
        log(mp.x + " " + mp.y + " " + mp.z);
    }

}
