import java.util.Random;
public class EmployeeWage {
    public static void main(String[] args){
        System.out.print("Welcome to Employee Wage Computation: ");
        Random ran = new Random();
        int employee_rate_hr = 20, work_hr=0, attend_count=0;
        while(work_hr<101 && attend_count<20){
            int attend = ran.nextInt(3);
            attend_count++;
            switch (attend) {
                case 1:
                    work_hr += 4;
                    break;
                case 2:
                    work_hr +=8;
                    break;
                default:
                    break;
            }
            System.out.println(work_hr+","+attend_count);
        }
        int x = work_hr*employee_rate_hr;
        System.out.println("Employee Present and it's wage is "+x);
    }
}
