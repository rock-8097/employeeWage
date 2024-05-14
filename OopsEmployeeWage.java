import java.util.Random;

public class OopsEmployeeWage {
    public static int randomeNumber(){
        Random ran = new Random();
        int attend = ran.nextInt(2);
        return attend;
    }
    public static int calculateWage(){
        int employee=randomeNumber();
        int fullday;
        if (employee==1){
            fullday=8;
        }else{
            fullday=0;
        }
        return fullday;
    }
    public static void main(String[] args) {
        int total = calculateWage();
        int wage_hour = 20;
        System.out.println(total*wage_hour);
    }
    
}
