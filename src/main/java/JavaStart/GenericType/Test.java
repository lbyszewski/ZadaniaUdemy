package JavaStart.GenericType;

import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args) {
        IntContainer intContainer = new IntContainer();
        intContainer.setIntArray(new int[]{1,2,3,4,5});
        intContainer.printArray();
    }

}
