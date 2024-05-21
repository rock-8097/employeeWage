public class Main {
    public static void main(String[] args) {
        //How many company store in array
        CompanyEmpWage companyEmpWage = new CompanyEmpWage();
        //company Employee Wage Set here
        companyEmpWage.addCompany("Company A", 500, 8, 4);
        companyEmpWage.addCompany("Company B", 700, 10, 5);
        //print company name and wage
        companyEmpWage.computeEmpWage();
    }
}