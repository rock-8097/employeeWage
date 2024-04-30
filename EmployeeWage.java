import java.util.Random;
public class EmployeeWage {
    public static void main(String[] args){
        System.out.print("Welcome to Employee Wage Computation");
        Random ran = new Random();
        boolean attend = ran.nextBoolean();
        System.out.println(attend);
        if (attend==false){
            System.out.println("Absent");
        }else{
            System.out.println("Present");
        }
    }
}
