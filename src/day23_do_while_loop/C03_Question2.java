package day23_do_while_loop;
 //to calculate sum of numbers, take numbers from the user
// and tell user to press 0 to end the app
// when user presses 0 code should print the sum of numbers

import java.util.Scanner;

public class C03_Question2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number =0;
        int sum =0;

        do{
            System.out.println("Please a enter a number");
            number = scan.nextInt();
            sum+=number;


        }while (number!=0);

        System.out.println("sum of the entered numbers : " + sum);
        }



    }
