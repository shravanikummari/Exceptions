package multipleexceptionhandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultiOperationHandler {

    public void performOperations() {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println(" Division by zero is not allowed.");
        }
        try {
            int[] numbers = {1, 2, 3};
            int index = 5;
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Array index out of bounds.");
        }
        try {
            File file = new File("nonexistentfile.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(" File not found.");
        } catch (IOException e) {
            System.out.println(" An I/O error occurred.");
        }
        try {
            File file = new File("readonlyfile.txt");
            if (!file.canWrite()) {
                throw new IOException("File is read-only.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("All operations completed.");
    }

    public static void main(String[] args) {
        MultiOperationHandler handler = new MultiOperationHandler();
        handler.performOperations();
    }
}