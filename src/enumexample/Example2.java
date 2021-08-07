package enumexample;

import java.util.Arrays;
import java.util.stream.Collectors;

import static fallk.logmaster.HLogger.log;

public class Example2 {

    public static void main(String[] args) {
        EnumExample[] enumExamples = new EnumExample[9];

        for(int i = 0; i < enumExamples.length; i++) {
            enumExamples[i] = EnumExample.values()[(i % 3)];
        }

        log("ARRAY -------------------------");
        log(Arrays.toString(enumExamples));
        log("ARRAY INTERPRETED AS INTS -----");
        log(Arrays.toString(Arrays.stream(enumExamples)
                .mapToInt(Enum::ordinal)
                .toArray()));

    }
}
