package day03;

import java.util.Scanner;

public class C03_ScannerQuestion {
    public static void main(String[] args) {

    //1) Create scanner object
        Scanner scan = new Scanner(System.in);


    //2) Ask user what you want

        System.out.println("Please enter your first and last name");


    //3) to save the data create variable

        String str = scan.nextLine();



    //4) manipulate the data

        System.out.println("user first and last name : " + str.toUpperCase());

        scan.close();


    }
}
