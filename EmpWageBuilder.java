public class EmpWageBuilder {
    private Employee employee;

    public EmpWageBuilder(Company company) {
        //new employee
        employee = new Employee(company);
    }

    public int computeWage() {
        // company wage for employee
        return employee.calculateWageMonth();
    }
}
