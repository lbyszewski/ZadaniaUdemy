package JavaStart.GenericType;

import java.util.Scanner;

public class TestClassGeneric {
    public static void main(String[] args) {



        GenericClass<Double, String> doubleStringGenericClass = new GenericClass<>();
        doubleStringGenericClass.setDoublesArray( new double[]{200d,5000d,6000d,7000d});
        doubleStringGenericClass.setNamesArray(new String[]{"Wolder", "Anna", "Sylwia", "Szymon"});
        doubleStringGenericClass.infoArray();

    }
}
