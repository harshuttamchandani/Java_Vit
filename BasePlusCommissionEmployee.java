class BasePlusCommissionEmployee extends Employee1 {
    private double grossSales;
    private double commissionRate;
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + (commissionRate * grossSales);
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee: " + getFirstName() + " " + getLastName();
    }
}

