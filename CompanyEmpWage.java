import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWage {
    private List<Company> companies;

    public CompanyEmpWage() {
        companies = new ArrayList<>();
    }

    public void addCompany(String name, int wageRate, int fullDay, int halfDay) {
        companies.add(new Company(name, wageRate, fullDay, halfDay));
    }

    public void computeEmpWage() {
        EmpWageCalculator empWageBuilder = new EmpWageBuilder();
        
        for (Company company : companies) {
            int totalEmpWage = empWageBuilder.calculateWage(company);
            System.out.println("Total wage for " + company.getName() + ": " + totalEmpWage);
        }
    }
}