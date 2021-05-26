package JavaStart.newTaxes;

public class CalculateTax {

    private  double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double calculateSalary(double salary){
        double result = 0;
        if (salary < 2500){
             result = salary * 9/100;
            return result;
        } else {
            double result2 = ((salary - 2500) * 17/100 ) - result;
            double finalResult = salary - result2;
            return finalResult;
        }

    }
}
