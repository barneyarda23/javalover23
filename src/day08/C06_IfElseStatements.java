package day08;

import java.util.Scanner;

//Ask the user for a letter, if the entered character is lowercase, print it in uppercase, otherwise print the entered letter
public class C06_IfElseStatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user! Please enter a character");

        char chr = scan.nextLine().charAt(0);

        if (chr >= 65 && chr <= 90) {
            System.out.println("Yes , It is an Uppercase character");


        }else {
            System.out.println("it is not uppercase");
        }

        System.out.println(chr+0);



        /*






         */






    }
}
