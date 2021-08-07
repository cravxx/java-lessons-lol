package enumexample;

import java.util.Arrays;
import java.util.stream.Collectors;

import static fallk.logmaster.HLogger.log;

public class Example1 {

    public static void main(String[] args) {
        int[] enumTest = new int[9];

        for(int i = 0; i < enumTest.length; i++) {
            enumTest[i] = i % 3;
        }

        log("ARRAY -------------------------");
        log(Arrays.toString(enumTest));
        log("ARRAY INTERPRETED AS ENUM -----");
        log(Arrays.toString(Arrays.stream(enumTest)
                .mapToObj(i -> EnumExample.values()[i])
                .toArray()));
    }

}
