package sideeffects;

public class Example2 {

    private final int[] data;

    public Example2() {
        data = new int[10];
    }

    public void load(final int[] dataInMethodScope) {
        /////method has a self-contained scope ... dataInMethodScope is a reference to the class level data int[]
        for(int i = 0; i < dataInMethodScope.length; i++) {
            dataInMethodScope[i] = i;
        }
    }

    public int[] getData() {
        return data;
    }

}
