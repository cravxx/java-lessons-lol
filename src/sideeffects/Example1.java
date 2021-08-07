package sideeffects;

public class Example1 {

    private final int[] data;

    public Example1() {
         data = new int[10];
    }

    public void loadData() {
        /////method is accessing class level variables
        for(int i = 0; i < data.length; i++) {
            data[i] = i;
        }
    }

    public int[] getData() {
        return data;
    }

}
