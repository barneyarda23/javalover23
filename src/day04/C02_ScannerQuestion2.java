package day04;

import java.util.Scanner;

public class C02_ScannerQuestion2 {
    public static void main(String[] args) {

        //Question 2- Take a double and an int number from the user and print their sum and product.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the name");
        String userName = scan.nextLine();

        System.out.println("Please enter the surname");
        String lastName = scan.next();

        System.out.println("Please enter the age");
        int  userAge = scan.nextInt();

        System.out.println("\nUser name : " + userName + "\nUser last name : " + lastName + "\nUser age : " + userName + "\nyour registration has been successfully compeleted");







    }
}
