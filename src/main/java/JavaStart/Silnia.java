package JavaStart;

public class Silnia {

    public  double silnia(double n){
        if (n == 0){
            return 1;
        } else {
            return  n* silnia(n-1);
        }
    }
}
