import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Error: Factorial doesn't takes the negative integers");  
        }else{
            long factorial = 1;
            for(int i = 1; i <= num; i++){
                factorial *= i;
            }
            System.out.println("The factorial is:" +factorial);
        }
        scanner.close();
    }
}
