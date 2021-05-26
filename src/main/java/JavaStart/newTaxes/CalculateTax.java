package JavaStart.newTaxes;

public class CalculateTax {

    private  double salary;
    private  double wifeSlaary;
    private  double husbandSlaary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getWifeSlaary() {
        return wifeSlaary;
    }

    public void setWifeSlaary(double wifeSlaary) {
        this.wifeSlaary = wifeSlaary;
    }

    public double getHusbandSlaary() {
        return husbandSlaary;
    }

    public void setHusbandSlaary(double husbandSlaary) {
        this.husbandSlaary = husbandSlaary;
    }

    public double calculateSalary(double salary){
        double standardPrice = 2500;
        double result = 0;
        if (salary <= standardPrice){
             result = salary * 9/100;
             double finalResultation = salary - result;
            return finalResultation;
        } else {
            double result2 = (salary * 9/100) - ((salary - standardPrice) * 17/100 )   ;
            double finalResult = salary - result2 ;
            return finalResult;
        }

    }
    public double newCalculation (double wifeSlaary, double husbandSlaary){
        double finalNewResult = 0;

        if(wifeSlaary <= husbandSlaary){

            finalNewResult = (husbandSlaary) - ((husbandSlaary * 80/100)) ;
            double x = finalNewResult * 8/100;
            double w =  finalNewResult - x;
            double y =  wifeSlaary + w;
            return y ;
        } else {
            return 0;
        }
    }

}
