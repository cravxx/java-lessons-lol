package sideeffects;

public class Example3 {

    private final int[] data;

    public Example3() {
        data = new int[10];
    }

    public int[] generateData(final int size) {
        int[] generatedData = new int[size];
        for(int i = 0; i < generatedData.length; i++) {
            generatedData[i] = i;
        }
        return generatedData;
    }

    public void setData(final int[] passedData) {
        System.arraycopy(passedData, 0, data, 0, data.length);
    }

    public int[] getData() {
        return data;
    }

}
