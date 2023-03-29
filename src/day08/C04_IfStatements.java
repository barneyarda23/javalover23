package day08;


import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = scan.nextInt();


        int retirementAge = 66;

        if(age>=retirementAge) {
            System.out.println("hey men you are retired");
        }

            if(age<retirementAge) {
                System.out.println("you need to work " + (retirementAge - age) + " more year.");
            }

            scan.close();
    }


//Homework: Question 4- Ask the user to enter a character, print whether the entered character is uppercase or not.





}
