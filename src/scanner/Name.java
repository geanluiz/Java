package scanner;

import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);
        System.out.print("Insert your name: ");

        String name = newScan.nextLine();
        System.out.println("Hello " + name + "!");
    }
}