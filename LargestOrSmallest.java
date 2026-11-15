import java.util.Scanner;
public class LargestOrSmallest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The First Number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter The First Number:");
        int num2 = scanner.nextInt();
        if(num1>num2){
            System.out.println("Num1 is Greater Than Num2");
        }else{
            System.out.println("Num2 is Greater Than Num1 And, Num2 is the Greater one");
        }
    scanner.close();
    }
}

