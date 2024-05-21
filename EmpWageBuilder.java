class EmpWageBuilder implements EmpWageCalculator {
       
    public int calculateWage(Company company) {
        Employee employee = new Employee(company);
        return employee.calculateWageMonth();
    }
}