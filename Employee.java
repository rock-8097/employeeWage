import java.util.Random;

public class Employee {
    private Company company;

    public Employee(Company company) {
        this.company = company;
    }

    public int randomeNumber() {
        Random ran = new Random();
        int attend = ran.nextInt(3); // Create random number between 0-2
        return attend; // Return random number
    }

    public int calculateWage() {
        int fullday= company.getFullday();
        int halfday = company.getHalfday();
        int employee = randomeNumber();
        int presentDayTime;
        switch (employee) {
            case 1:
                presentDayTime=fullday ; // Full Day Wage
                break;
            case 2:
                presentDayTime= halfday; // Part-time Wage
                break;
            default:
                presentDayTime=0; // Employee Absent
                break;
        }
        return presentDayTime * company.getWageRate(); // Return wage based on company's rate
    }

    public int calculateWageMonth() {
        int totalWage = 0, attend_count = 0;
        while (totalWage < 101 && attend_count < 20) { // Loop for 20 Days or completed 100 Hrs
            int total = calculateWage();
            totalWage += total;
            attend_count += 1;
        }
        return totalWage; // Return 20 Day Working Hours
    }
}
