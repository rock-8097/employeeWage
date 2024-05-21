public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Company A", 20, 8, 4);
        Company company2 = new Company("Company B", 25, 12, 6);

        EmpWageBuilder emp1 = new EmpWageBuilder(company1);
        EmpWageBuilder emp2 = new EmpWageBuilder(company2);

        int workCompany1 = emp1.computeWage();
        int workCompany2 = emp2.computeWage();

        System.out.println("Total wage for " + company1.getName() + ": " + workCompany1);
        System.out.println("Total wage for " + company2.getName() + ": " + workCompany2);
    }
}
