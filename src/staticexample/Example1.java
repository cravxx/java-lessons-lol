package staticexample;

public class Example1 {

    @Override
    public String toString() {
        return "Example1{" +
                "staticVariable=" + staticVariable +
                "variable=" + variable +
                '}';
    }

    public static int staticVariable = 1;
    public int variable = 1;

    public Example1(final int i) {
        variable = i;
    }

    public void setStaticVariable(int _staticVariable) {
        staticVariable = _staticVariable;
    }

}
