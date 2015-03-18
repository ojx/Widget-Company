import java.time.LocalDate;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private LocalDate dateOfBirth;

    public Employee(int id, String firstName, String lastName, double salary, LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary / 12;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return lastName.toUpperCase() + ", " + firstName + " - " + getClass().getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee employee = (Employee)obj;

            return firstName.equals(employee.getFirstName()) && lastName.equals(employee.getLastName()) && dateOfBirth.equals(employee.getDateOfBirth());
        }
        return false;
    }
}
