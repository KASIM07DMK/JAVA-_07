import java.util.Scanner;
public class SumOfTwoNumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a num:");
        int number1 = scanner.nextInt();
        System.out.println("enter a num:");
        int number2 = scanner.nextInt();
        scanner.close();
        int sum= number1 + number2;
        System.out.println("The sum is:"+sum);
    }
}
