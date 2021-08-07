package staticexample;

import static fallk.logmaster.HLogger.log;

public class StaticExample1 {

    public void publicMethod() {}

    protected void protectedMethod() {}

    void method() {}

    private void privateMethod() {}

    public static void main(String[] args) {

        Example1 example1 = new Example1(9);
        example1.setStaticVariable(100);

        log(example1.toString());

        Example1 example2 = new Example1(17);

        log(example2.toString());

    }
}
