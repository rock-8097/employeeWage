class Company {
    private String name;
    private int wageRate;
    private int fullDay;
    private int halfDay;
    
    //constructor
    public Company(String name, int wageRate, int fullDay, int halfDay) {
        this.name = name;
        this.wageRate = wageRate;
        this.fullDay = fullDay;
        this.halfDay = halfDay;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }

    public int getWageRate() {
        return wageRate;
    }

    public int getFullDay() {
        return fullDay;
    }

    public int getHalfDay() {
        return halfDay;
    }
}
