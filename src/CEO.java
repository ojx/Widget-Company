import java.time.LocalDate;

public class CEO extends Manager {

    private double bonus;

    public CEO(int id, String firstName, String lastName, double salary, LocalDate dateOfBirth, String securityCode, double bonus) {
        super(id, firstName, lastName, salary, dateOfBirth, securityCode);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus / 12;
    }
}
