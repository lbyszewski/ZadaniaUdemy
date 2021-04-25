package JavaStart.GenericType;

import java.util.Scanner;

public class TestGenericClass {
    public static void main(String[] args) {

        System.out.println("podaj typ generyczny:");

        Scanner scanner = new Scanner(System.in);
        Double genericTypeOne = scanner.nextDouble();
        String genericTypeTwo = scanner.next();








        //GenericClass<Double, String> doubleStringGenericClass = new GenericClass<>();
        //doubleStringGenericClass.setDoublesArray(new double[]{10000,20000,1000000,200000000,3000000});
       // doubleStringGenericClass.setNamesArray(new String[]{"Paweł", "Krzysiek", "Ania", "Sylwia"});
      //  doubleStringGenericClass.infoArray();
    }
}
