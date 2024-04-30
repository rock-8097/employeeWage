import java.util.Random;
public class EmployeeWage {
    public static void main(String[] args){
        System.out.print("Welcome to Employee Wage Computation");
        Random ran = new Random();
        boolean attend = ran.nextBoolean();
        int employee_rate_hr = 20, work_hr;
        System.out.println(attend);
        if (attend==true){
            int attend_hr = ran.nextInt(2);
            if (attend_hr==0){
                work_hr = 4;
            }
            else{
                work_hr = 8;
            }
            int x = work_hr*employee_rate_hr;
            System.out.println("Employee Present and it's wage is "+x);
        }
        else{
            System.out.println("Employee Absent");
        }
    }
}
