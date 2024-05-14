import java.util.Random;

public class OopsEmployeeWage {
    public static int randomeNumber(){
        Random ran = new Random();
        int attend = ran.nextInt(3);//Create randome 0-2 number
        return attend;//Return randome number
    }
    public static int calculateWage(){
        int employee=randomeNumber();
        int fullday;
        switch (employee) {
            case 1:
                fullday = 8; // Full Day Wage
                break;
            case 2:
                fullday = 4; // Part time Wage
                break;
            default:
                fullday = 0; // Employee Absent
                break;
        }
        return fullday;//Return wage time in Hour
    }
    public static int calculateWageMonth(){
        int totalWage=0;
        for(int i=0; i<20; i++){//Loop for 20 Days
            int total = calculateWage();
            totalWage+=total;
        }
        return totalWage;//Return 20 Day Working Hours
    }
    public static void main(String[] args) {
        int work=calculateWageMonth();
        int wage_hour = 20;
        System.out.println(work*wage_hour);
    }
}
