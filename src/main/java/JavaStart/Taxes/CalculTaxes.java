package JavaStart.Taxes;




public class CalculTaxes {

    private double basicSalary;
    private boolean isGreater;



    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "CalculTaxes{" +
                "basicSalary=" + basicSalary +
                '}';
    }

    public boolean isGreater() {
        return isGreater;
    }

    public void setGreater(boolean greater) {
        isGreater = greater;
    }
}
