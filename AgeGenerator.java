import java.util.Scanner;
public class AgeGenerator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your birth Year:");
        int birth_year = scanner.nextInt();
        System.out.println("Enter the Present Year:");
        int present_year = scanner.nextInt();
        int Age = present_year - birth_year;
        System.out.println("your Present_Age:"+ Age);
        scanner.close();
    }
}
