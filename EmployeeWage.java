import java.util.Random;
public class EmployeeWage {
    public static void main(String[] args){
        System.out.print("Welcome to Employee Wage Computation: ");
        Random ran = new Random();
        int employee_rate_hr = 20, work_hr=0, sal=0;
        for (int i=0; i<=20; i++){
            int attend = ran.nextInt(3);
            switch (attend) {
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
                sal+=x;
            }
        }
        System.out.println("Employee Present and it's wage is "+sal);
    }
}
