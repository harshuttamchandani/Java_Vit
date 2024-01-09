public class EmployeeTest {
    public static void main(String[] args) {
        Employee1 employee1 = new BasePlusCommissionEmployee("John", "Doe", 50000.0, 0.1, 2000.0);
        Employee1 employee2 = new BasePlusCommissionEmployee("Jane", "Smith", 60000.0, 0.12, 2500.0);

        System.out.println(employee1);
        System.out.println("Earnings: $" + employee1.earnings());

        System.out.println();

        System.out.println(employee2);
        System.out.println("Earnings: $" + employee2.earnings());
    }
}