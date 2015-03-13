import java.time.LocalDate;

public class WidgetMaker extends Employee {

    private int monthlyWidgetProduction;

    public WidgetMaker(int id, String firstName, String lastName, double salary, LocalDate dateOfBirth) {
        super(id, firstName, lastName, salary, dateOfBirth);
    }

    public void setMonthlyWidgetProduction(int monthlyWidgetProduction) {
        this.monthlyWidgetProduction = monthlyWidgetProduction;
    }

    public int getMonthlyWidgetProduction() {
        return monthlyWidgetProduction;
    }
}
