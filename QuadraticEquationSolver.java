import java.util.Scanner;
public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients a and b for the quadratic equation ax^2 + bx = 0:");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        // Coefficient c is assumed to be 0
        double c = 0;

        // Calculate the discriminant D
        double discriminant = b * b - 4 * a * c;

        System.out.println("Discriminant (D) = " + discriminant);

        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            // One real root (repeated)
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);
        } else {
            // No real roots (complex roots)
            System.out.println("Equation has no real roots (complex roots).");
        }

        scanner.close();
    }
}