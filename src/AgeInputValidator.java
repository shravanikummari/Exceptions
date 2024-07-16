import java.util.*;
public class AgeInputValidator {
    public int getValidAge() {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean Valid = false;
        while (!Valid) {
            System.out.print("Please enter your age: ");
            try {
                age = scanner.nextInt();
                if (age >= 1 && age <= 120) {
                    Valid = true;
                } else {
                    System.out.println("enter your age.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
           scanner.next();
            }
        }
        return age;
    }
    public static void main(String[] args) {
        AgeInputValidator validator = new AgeInputValidator();
        int validAge = validator.getValidAge();
        System.out.println("You entered a valid age: " + validAge);
    }
}
