package arrayindexoutofbounds;
import java.util.Scanner;

public class ArrayAccess {
   private int[] numbers;
   public ArrayAccess(){
       numbers=new int[]{10,15,20,25,30};
   }
   public void accessElement(){
       Scanner scanner=new Scanner(System.in);
       boolean valid =false;
       while (!valid){
           try {
               System.out.println("enter an index to access an element");
               int index=scanner.nextInt();
               System.out.println(numbers[index]);
               valid=true;
           }
           catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("Invalid index! Please enter an index between 0 and " + (numbers.length - 1));
           }
           catch (Exception e){
               System.out.println("invalid input");
               scanner.next();
           }
       }
       scanner.close();
   }

    public static void main(String[] args) {
        ArrayAccess aa=new ArrayAccess();
        aa.accessElement();
    }
}
