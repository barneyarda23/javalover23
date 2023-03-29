package day12;

import java.util.Scanner;
// switch method u cant use boolean , long , float , double

public class C02_SwitchStatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("hey user! please provide a letter");
        char letter = scan.next().charAt(0);
        letter = Character.toUpperCase(letter);

        if (letter == 'M') {
            System.out.println("Monday");
        } else if (letter == 'T') {
            System.out.println("Tuesday and Thursday");

        } else if (letter == 'W') {
            System.out.println("Wednesday");

        } else if (letter == 'F') {
            System.out.println("Friday");


        } else if (letter == 'S')
            System.out.println("Saturday and sunday");
        else {
            System.out.println("Invalid Letter");


        }

        switch (letter){
            case 'M' :
                System.out.println("Monday");
                break;
            case 'T' :
                System.out.println("Tuesday and Thursday");
                break;
            case 'W' :
                System.out.println("Wednesday");
                break;
            case 'F':
                System.out.println("Friday");
                break;
            case 'S' :
                System.out.println("Saturday and Sunday");
                break;
            default:
                System.out.println("Invalid Letter");
        }


        /*
        Switch statement is used when you have too many else if
        it is faster
        if you want execution top stop you should use break. Otherwise, java will continue to run switch statement until find a break or to the end.


         */

    }
}