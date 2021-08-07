package abstractexample;

import static fallk.logmaster.HLogger.log;

public class AbstractExample1 {

    public static void main(String[] args) {
        Example1Extended example1Extended = new Example1Extended();
        log(example1Extended.value);
        example1Extended.increment();
        log(example1Extended.value);
        example1Extended.incrementBy(5);
        log(example1Extended.value);

    }
}
