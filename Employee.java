import java.util.Random;

public class Employee {
    public static int randomeNumber() {
        Random ran = new Random();
        int attend = ran.nextInt(3); // Create random number between 0-2
        return attend; // Return random number
    }

    public static int calculateWage() {
        int employee = randomeNumber();
        int fullday;
        switch (employee) {
            case 1:
                fullday = 8; // Full Day Wage
                break;
            case 2:
                fullday = 4; // Part-time Wage
                break;
            default:
                fullday = 0; // Employee Absent
                break;
        }
        return fullday; // Return wage time in hours
    }

    public static int calculateWageMonth() {
        int totalWage = 0, attend_count = 0;
        while (totalWage < 101 && attend_count < 20) { // Loop for 20 Days or completed 100 Hrs
            int total = calculateWage();
            totalWage += total;
            attend_count += 1;
        }
        return totalWage; // Return 20 Day Working Hours
    }
}
