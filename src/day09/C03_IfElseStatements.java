package day09;

import java.util.Scanner;
//Question 1- Get the gender and age from the user.
// Female, 60 years old and over, Male 65 years and older can retire.
// Print “You can retire” or // “You need to work . more years to retire”,

public class C03_IfElseStatements {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Pls enter your gender as female or male");
        char gender = scan.next().charAt(0);


        System.out.println("Pls enter your age");

        int age = scan.nextInt();

        if (gender== 'F' && age>=60 || gender== 'M' && age>=65) {
            System.out.println(" You can retire");

        }else if (gender== 'F') {
            System.out.println("You need to work " +  (60-age) + "more years to retire" );

        }else if (gender== 'M') {
            System.out.println("You need to work " + (65 - age) + "more years to retire");
        }




    }
}
