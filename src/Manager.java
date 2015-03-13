import java.time.LocalDate;

public class Manager extends Employee {

    private String securityCode;

    public Manager(int id, String firstName, String lastName, double salary, LocalDate dateOfBirth, String securityCode) {
        super(id, firstName, lastName, salary, dateOfBirth);
        this.securityCode = securityCode;
    }

    public String getSecurityCode() {
        return securityCode;
    }
}
