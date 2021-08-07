package sideeffects;

import java.util.Arrays;

import static fallk.logmaster.HLogger.log;

public class SideEffectsExample2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();

        example2.load(example2.getData());

        log(Arrays.toString(example2.getData()));
    }
}
