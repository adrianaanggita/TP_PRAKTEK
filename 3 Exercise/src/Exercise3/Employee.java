package Exercise3;

class Employee extends Sortable{
    private String name;
    private double salary;
    private int hireDay;
    private int hireMonth;
    private int hireYear;

    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireDay = day;
        hireMonth = month;
        hireYear = year;
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int hireYear() {
        return hireYear;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    @Override
    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (salary < eb.salary) return -1;
        if (salary > eb.salary) return +1;
        return 0;
    }
}
