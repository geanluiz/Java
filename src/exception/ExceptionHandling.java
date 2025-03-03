package exception;

import java.util.Scanner;
import java.lang.Exception;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int input = sc.nextInt();

            System.out.println("You entered: " + input);
        }
        catch (Exception e){
            System.out.println("Invalid number, try again!");
        }
    }
}
