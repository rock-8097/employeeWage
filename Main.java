public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Company A", 20);
        Company company2 = new Company("Company B", 25);

        Employee emp1 = new Employee(company1);
        Employee emp2 = new Employee(company2);

        int workCompany1 = emp1.calculateWageMonth();
        int workCompany2 = emp2.calculateWageMonth();

        System.out.println("Total wage for " + company1.getName() + ": " + workCompany1);
        System.out.println("Total wage for " + company2.getName() + ": " + workCompany2);
    }
}
