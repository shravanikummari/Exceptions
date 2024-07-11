package exceptionsexample;
import java.util.Scanner;
public class Shravani {
    public static void main(String[] args) {

        try {
            String [] arr = {"my", "name","is","ShravaniK","iam","an","employee"};
            System.out.println(arr[3]);
            System.out.println(arr[6]);
            System.out.println(arr[1]);
            //System.out.println(arr[7]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }}


