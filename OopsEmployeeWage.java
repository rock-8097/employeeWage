import java.util.Random;

public class OopsEmployeeWage {
    public static int randomeNumber(){
        Random ran = new Random();
        int attend = ran.nextInt(2);
        return attend;
    }
    public static void main(String[] args) {
        int employee=randomeNumber();
        if (employee==1){
            System.out.println("Emplyee present");
        }else{
            System.out.println("Emplyee Not present");
        }
    }
    
}
