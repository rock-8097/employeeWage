import java.util.Random;
public class EmployeeWage {
    public static void main(String[] args){
        System.out.print("Welcome to Employee Wage Computation: ");
        Random ran = new Random();
        int attend = ran.nextInt(3);
        int employee_rate_hr = 20, work_hr=0;
        System.out.println(attend);
        switch (attend) {
            case 0:
                System.out.println("Employee Absent");
                break;
            case 1:
                work_hr = 4;
                break;
            case 2:
                work_hr =8;
                break;
            default:
                break;
        }
        if (work_hr!=0){
            int x = work_hr*employee_rate_hr;
            System.out.println("Employee Present and it's wage is "+x);
        }
    }
}
