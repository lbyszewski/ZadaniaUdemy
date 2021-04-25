package JavaStart.GenericType;

public class IntContainer {
    private int [] intArray;

    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public void printArray(){
        for (int i : intArray){
            System.out.println(i);
        }
    }
}
