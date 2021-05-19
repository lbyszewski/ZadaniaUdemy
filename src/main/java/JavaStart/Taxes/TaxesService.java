package JavaStart.Taxes;

public class TaxesService {

    public double calculateBalances(CalculTaxes calculTaxes, double salary) {
        if (calculTaxes.isGreater()) {
            return calculateTaxWith(salary);
        } else {
            return dontCalculate(salary);
        }

    }

    private double calculateTaxWith(double salaryEnd) {
        if (salaryEnd > 2500) {
            double result = (salaryEnd * 17 / 100) - (salaryEnd * 9 / 100);
            return result;
        } else {
            return 0;
        }
    }

    private double dontCalculate(double salary) {
        if (salary == 2500){
            return salary;
        } else {
            return 0;
        }


    }
}


