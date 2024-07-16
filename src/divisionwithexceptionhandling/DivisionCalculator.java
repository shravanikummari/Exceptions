package divisionwithexceptionhandling;
import java.util.*;
public class DivisionCalculator {
    public void performDivision() {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = scanner.nextInt();
                System.out.print("Enter the second integer: ");
                num2 = scanner.nextInt();
                int result = num1 / num2;
                System.out.println("The result of " + num1 + " / " + num2 + " is: " + result);
                validInput = true;
                break;
            } catch (ArithmeticException e) {
                System.out.println(" Division by zero is not allowed. Please try again.");
            } catch (InputMismatchException e) {
                System.out.println(" Invalid input. Please enter integers only.");
                scanner.next();
            }
        }
        scanner.close();
    }
    public static void main(String[] args) {
        DivisionCalculator calculator = new DivisionCalculator();
        calculator.performDivision();
    }
}