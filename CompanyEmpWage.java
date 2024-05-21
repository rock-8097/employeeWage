public class CompanyEmpWage {
    private Company[] companies;
    private int numOfCompaniesAdded;

    public CompanyEmpWage(int numOfCompanies) {
        companies = new Company[numOfCompanies];
        numOfCompaniesAdded = 0;
    }

    public void addCompany(String name, int wageRate, int fullDay, int halfDay) {
        if (numOfCompaniesAdded < companies.length) {
            companies[numOfCompaniesAdded++] = new Company(name, wageRate, fullDay, halfDay);
        } else {
            System.out.println("Maximum companies limit reached.");
        }
    }

    public void computeEmpWage() {
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        for (Company company : companies) {
            int totalEmpWage = empWageBuilder.computeWage(company);
            System.out.println("Total wage for " + company.getName() + ": " + totalEmpWage);
        }
    }
}