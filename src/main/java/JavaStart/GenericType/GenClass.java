package JavaStart.GenericType;

import java.util.Arrays;

public class GenClass<T,V> {

    private T[] arraysOfSomething;
    private V[] arraysOfSomethingElse;

    public GenClass(T[] arraysOfSomething, V[] arraysOfSomethingElse) {
        this.arraysOfSomething = arraysOfSomething;
        this.arraysOfSomethingElse = arraysOfSomethingElse;
    }

    public T[] getArraysOfSomething() {
        return arraysOfSomething;
    }

    public void setArraysOfSomething(T[] arraysOfSomething) {
        this.arraysOfSomething = arraysOfSomething;
    }

    public V[] getArraysOfSomethingElse() {
        return arraysOfSomethingElse;
    }

    public void setArraysOfSomethingElse(V[] arraysOfSomethingElse) {
        this.arraysOfSomethingElse = arraysOfSomethingElse;
    }

    public void infoTeam(){

        for (T typeOne : arraysOfSomething ){
            System.out.println(typeOne);
        }

        for (V typeTwo: arraysOfSomethingElse){
            System.out.println(typeTwo);
        }
    }

    @Override
    public String toString() {
        return "GenClass{" +
                "arraysOfSomething=" + Arrays.toString(arraysOfSomething) +
                ", arraysOfSomethingElse=" + Arrays.toString(arraysOfSomethingElse) +
                '}';
    }
}
