package AnotherTypeOfEmployee;

public class Commission extends Hourly {
    private double sales;
    private double CRate;

    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double eCRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        CRate = eCRate;
    }

    public void addSales(double totalSales) {
        sales = totalSales * CRate;
    }

    public double pay() {
        double payment = super.pay() + sales;

        sales = 0;

        return payment;
    }
}
