public class Company {
    private String name;
    private int wageRate;
    private int fullday;
    private int halfday;

    
    public Company(String name, int wageRate, int fullday, int halfday) {
        this.name = name;
        this.wageRate = wageRate;
        this.fullday = fullday;
        this.halfday = halfday;
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

    public int getFullday() {
        return fullday;
    }
    
    public void setFullday(int fullday) {
        this.fullday = fullday;
    }
    
    public int getHalfday() {
        return halfday;
    }
    
    public void setHalfday(int halfday) {
        this.halfday = halfday;
    }
}
