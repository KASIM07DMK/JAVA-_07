import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = scanner.nextInt();
        if(num>0){
            System.out.println("Entered integer is a Positive Integer.");
        }else{
            System.out.println("Entered number is a Negative Integer.");
        }
    scanner.close();
    }
}
