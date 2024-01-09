class Employee1 {
    private String firstName;
    private String lastName;

    public Employee1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double earnings() {
        return 0.0; // Base class method, overridden by derived classes
    }

    @Override
    public String toString() {
        return "Employee: " + getFirstName() + " " + getLastName();
    }
}


