import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.println("it is an Even Number.");
        }else{
            System.out.println("if is an Odd Number.");
        }
    scanner.close();
    }
}


