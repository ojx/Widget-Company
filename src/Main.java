import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new CEO(13134, "Helen", "McClair", 176000, LocalDate.of(1972, 8, 20), "BX832Z", 15000));

        employees.add(new Manager(43122, "Jason", "Lee", 95000, LocalDate.of(1979, 3, 25), "PR430Q"));
        employees.add(new Manager(24329, "Margarette", "Wallace", 92000, LocalDate.of(1968, 11, 7), "VA961P"));

        employees.add(new SalesPerson(81290, "Pete", "Helmstrom", 20500, LocalDate.of(1985, 4, 18)));
        employees.add(new SalesPerson(28934, "Mohamed", "Aruna", 20500, LocalDate.of(1990, 12, 15)));
        employees.add(new SalesPerson(53411, "Zhu", "Chung", 20500, LocalDate.of(1982, 7, 5)));

        employees.add(new WidgetMaker(93120, "Kevin", "LeGrunge", 31500, LocalDate.of(1984, 11, 22)));
        employees.add(new WidgetMaker(48123, "Alice", "Winkle", 31500, LocalDate.of(1991, 1, 11)));
        employees.add(new WidgetMaker(72131, "Jane", "Doe", 31500, LocalDate.of(1978, 5, 8)));
        employees.add(new WidgetMaker(87047, "Arena", "Oberoi", 31500, LocalDate.of(1980, 2, 14)));
        employees.add(new WidgetMaker(63403, "Larry", "Lucky", 31500, LocalDate.of(1983, 9, 30)));


        for (Employee employee : employees) {
            if (employee instanceof SalesPerson) {
                SalesPerson salesPerson = (SalesPerson)employee;
                salesPerson.setMonthlySales((int) (Math.random() * 200));
            } else if (employee instanceof  WidgetMaker) {
                WidgetMaker widgetMaker = (WidgetMaker)employee;
                widgetMaker.setMonthlyWidgetProduction((int) (Math.random() * 40) + 40);
            }
        }

        double totalMonthlyPayRoll = calculateTotalMonthlyPay(employees);
        System.out.println(totalMonthlyPayRoll);

        Employee topSalesPerson = getTopSalesPerson(employees);
        System.out.println(topSalesPerson.getFirstName() + " " + topSalesPerson.getLastName());

        printAllEmployees(employees);

        Employee e1 = new SalesPerson(45432, "James", "Roberts", 20500, LocalDate.of(1991, 4, 25));
        Employee e2 = new Manager(19093, "Larry", "Lucky", 85700, LocalDate.of(1983, 9, 30), "XB092P");

        if (isEmployee(employees, e1))
            System.out.println(e1.getFirstName() + " " + e1.getLastName() + " is an employee of the Widget Company");
        else
            System.out.println(e1.getFirstName() + " " + e1.getLastName() + " is NOT an employee of the Widget Company");

        if (isEmployee(employees, e2))
            System.out.println(e2.getFirstName() + " " + e2.getLastName() + " is an employee of the Widget Company");
        else
            System.out.println(e2.getFirstName() + " " + e2.getLastName() + " is NOT an employee of the Widget Company");
    }

    private static boolean isEmployee(ArrayList<Employee> employees, Employee employee) {

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).equals(employee))
                return true;
        }

        return false;
    }


    private static void printAllEmployees(ArrayList<Employee> employees) {

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    private static Employee getTopSalesPerson(ArrayList<Employee> employees) {
        SalesPerson top = null;

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof SalesPerson) {
                SalesPerson salesPerson = (SalesPerson)employees.get(i);
                if (top == null || top.getMonthlySales() < salesPerson.getMonthlySales()) {
                    top = salesPerson;
                }
            }
        }

        return top;
    }

    private static double calculateTotalMonthlyPay(ArrayList<Employee> employees) {
        double pay = 0;

        for (int i = 0; i < employees.size(); i++) {
            pay += employees.get(i).getSalary();
        }

        return pay;
    }
}
