import java.util.Random;

class Employee {
    private Company company;

    public Employee(Company company) {
        this.company = company;
    }

    public int randomNumber() {
        Random ran = new Random();
        return ran.nextInt(3); // Generate random number between 0-2
    }

    public int calculateWage() {
        int fullDay = company.getFullDay();
        int halfDay = company.getHalfDay();
        int employeeAttendance = randomNumber();
        int presentDayTime;
        switch (employeeAttendance) {
            case 1:
                presentDayTime = fullDay; // Full Day Wage
                break;
            case 2:
                presentDayTime = halfDay; // Part-time Wage
                break;
            default:
                presentDayTime = 0; // Employee Absent
                break;
        }
        return presentDayTime * company.getWageRate(); // Return wage based on company's rate
    }

    public int calculateWageMonth() {
        int totalWage = 0;
        for (int day = 0; day < 20; day++) { // Loop for 20 Days or completed 100 Hrs
            totalWage += calculateWage();
        }
        return totalWage; // Return 20 Day Working Hours
    }
}