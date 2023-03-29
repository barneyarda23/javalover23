package day08;

import java.util.Scanner;

public class C01_IfStatements {



    //Q1 - Ask the user for a number, check the number and print “Number a multiple of 5” if it is divisible by 5.

    public static void main(String[] args) {

       // if (condition) { action depends on the conditon is true }

        int num1 = 10;
        int num2 = 20;


        if (num1<num2) {
            System.out.println("number 1 is smaller than number2");// it will print  the body since condition is true
        }

        if (num1>num2) {
            System.out.println("number 1 is smaller than number2");// it wont print the body since condition is false
        }



        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user please enter a number");
        int numInt = scan.nextInt();


        boolean divisibilytCheck = numInt%5 == 0;

        if(divisibilytCheck) {
            System.out.println(numInt + "Number a multiple a of 5");
        }
        // "Process finished with exit code 0" means execution is successfully completed.












    }
}
