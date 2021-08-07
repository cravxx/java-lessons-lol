package sideeffects;

import java.util.Arrays;

import static fallk.logmaster.HLogger.log;

public class SideEffectsExample3 {

    public static void main(String[] args) {
        Example3 example3 = new Example3();

        int[] data = example3.generateData(10);

        example3.setData(data);

        log(Arrays.toString(example3.getData()));
    }
}
