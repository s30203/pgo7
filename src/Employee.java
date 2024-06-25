public class Employee extends Person {
    public int hireDate;
    public String companyName;
    public double salary;
    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }
    public int getJobSeniority() {
        return java.time.Year.now().getValue() - hireDate;
    }
    public double getSalary() {
        return salary;
    }
}
