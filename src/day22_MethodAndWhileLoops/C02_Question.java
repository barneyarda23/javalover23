package day22_MethodAndWhileLoops;
// //Question 1- Let's take a positive integer from the user and find the sum of the digits with the while loops

import java.util.Scanner;

public class C02_Question {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();

        int sum = 0;

        while (num!=0){

            sum = sum + num % 10; // this one always give the last digit
            num = num/10;
        }
        System.out.println(sum);


        //length of a number 12043 => length is 5

        int number = 12345;
        String numberToString = ""+number;
        numberToString.length();




    }





}
