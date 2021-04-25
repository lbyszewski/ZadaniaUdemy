package JavaStart.GenericType;

public class GenericClass <T,V> {

    private double []  doublesArray;

    private String []  namesArray;

    public double[] getDoublesArray() {
        return doublesArray;
    }

    public void setDoublesArray(double[] doublesArray) {
        this.doublesArray = doublesArray;
    }

    public String[] getNamesArray() {
        return namesArray;
    }

    public void setNamesArray(String[] namesArray) {
        this.namesArray = namesArray;
    }

    public  void infoArray(){
        for (double i : doublesArray){
            System.out.println(i);
        }

        for (String s : namesArray){
            System.out.println(s);
        }
    }


}
