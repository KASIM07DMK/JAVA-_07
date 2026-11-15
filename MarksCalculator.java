import java.util.Scanner;
public class MarksCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Subject1 marks:");
        int s1 = scanner.nextInt();
        System.out.println("Enter Subject2 marks:");
        int s2 = scanner.nextInt();
        System.out.println("Enter Subject3 marks:");
        int s3 = scanner.nextInt();
        System.out.println("Enter Subject4 marks:");
        int s4 = scanner.nextInt();
        System.out.println("Enter Subject5 marks:");
        int s5 = scanner.nextInt();
        System.out.println("Enter Subject6 marks:");
        int s6 = scanner.nextInt();
        
        long Total = s1 + s2 + s3 + s4 + s5 + s6;
        double Percentage = Total/6;
        
        if(Percentage >= 80){
            System.out.println("Grade A");
        } else if(Percentage <= 80){
            System.out.println("Grade B");
        } else if(Percentage <= 45){
            System.out.println("Grade C");
        } else if(Percentage <= 35){
            System.out.println("Grade D");
        } else{
            System.out.println("You are Failed!");
        }
        System.out.println("Total Marks:" +Total);
        System.out.println("Percentage:"+Percentage);

    scanner.close();
    }
}
