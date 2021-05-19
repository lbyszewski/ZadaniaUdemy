package JavaStart.Ułamek;

public class Fraction {
    private double licznik;
    private double mianownik;

    public Fraction(double licznik, double mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public double getLicznik() {
        return licznik;
    }

    public void setLicznik(double licznik) {
        this.licznik = licznik;
    }

    public double getMianownik() {
        return mianownik;
    }

    public void setMianownik(double mianownik) {
        this.mianownik = mianownik;
    }







    private Fraction []  sameFraction(){

        Fraction [] fractions = new Fraction[3];
        fractions[0].licznik =  fractions[0].licznik * fractions[1].mianownik;
        fractions[1].licznik = fractions[0].mianownik * fractions[1].licznik;
        fractions[2].mianownik = fractions[0].mianownik = fractions[1].mianownik;




        return fractions ;
    }



    public Fraction[]  appendTwoFraction( Fraction firstFraction  ){

        Fraction [] fraction = sameFraction();





        return fraction ;
    }
}
