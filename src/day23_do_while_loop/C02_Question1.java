package day23_do_while_loop;

//QUESTION- //ask user for an int and print the numbers including until that integer

import java.util.Scanner;

public class C02_Question1 {
    public static void main(String[] args) {

        int startingNumber = 1;
        int sum = 0;

        while (startingNumber<10){

            sum = sum+startingNumber;
            startingNumber++;


        }
        System.out.println("sum of the number from while loop" + sum);

        startingNumber =1;
        sum = 0;
        do{
            sum = sum + startingNumber;
            startingNumber++;

        }while (startingNumber<10);

        System.out.println("sum of the number from do while loop" + sum);

    }
}
