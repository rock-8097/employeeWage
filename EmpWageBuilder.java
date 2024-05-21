public class EmpWageBuilder {
       
    public int computeWage(Company company) {
        //new employee
        Employee employee = new Employee(company);
        return employee.calculateWageMonth();
    }
}