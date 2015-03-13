import java.time.LocalDate;

public class SalesPerson extends Employee {
    private static final double COMMISSION_PER_SALE = 50;

    private int monthlySales;

    public SalesPerson(int id, String firstName, String lastName, double salary, LocalDate dateOfBirth) {
        super(id, firstName, lastName, salary, dateOfBirth);
    }

    public void setMonthlySales(int monthlySales) {
        this.monthlySales = monthlySales;
    }

    public int getMonthlySales() {
        return monthlySales;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + monthlySales * COMMISSION_PER_SALE;
    }
}
