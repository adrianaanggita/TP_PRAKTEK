package Exercise3;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Manager extends Employee {
    private String secretaryName;

    public Manager (String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = " ";
    }
    public void raiseSalary(double byPercent) {
        // add 0.5% bonus for every year of service
        GregorianCalendar todayDate = new GregorianCalendar();
        int currentYear = todayDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    /** SOLUTION */
    @Override
    public int compare(Sortable b) {
        return super.compare(b);
    }

    /** It wont work, because a subclass can only have one superclass
     *  Solution :
     *  The Manager Class does not need to extend to the Sortable Class,
     *  because the superclass itself, which is an Employee Class,
     *  is already a subclass of the Sortable Class.
     *  So when the Manager class needs to use a method from the
     *  Sortable class, just override the "compare" method
     *  as you can see above
     */
}
