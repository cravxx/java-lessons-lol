package sideeffects;

import java.util.Arrays;

import static fallk.logmaster.HLogger.log;

public class SideEffectsExample1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();

        example1.loadData();

        log(Arrays.toString(example1.getData()));
    }
}
