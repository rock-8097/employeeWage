public class Company {
    private String name;
    private int wageRate;

    public Company(String name, int wageRate) {
        this.name = name;
        this.wageRate = wageRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWageRate() {
        return wageRate;
    }

    public void setWageRate(int wageRate) {
        this.wageRate = wageRate;
    }

}
