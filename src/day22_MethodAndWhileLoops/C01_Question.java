package day22_MethodAndWhileLoops;
//Question 2- Get the user's name and surname separately in the main method
// Create a method that returns:
// first letters of first and last name as capitals and rest should be in lower case
// input : name : Ali    surname :YILMAZ
// output : Ali Yilmaz

import java.util.Scanner;

public class C01_Question {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter your first name");
        String firstName = scan.next();
        System.out.println("Pls enter your surname");
        String lastName = scan.next();

        System.out.println(nameConverter(firstName,lastName));









    }

    public static String nameConverter(String firstName , String lastNAme){

        String outPut = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() + " " +
                        lastNAme.substring(0,1).toUpperCase() + lastNAme.substring(1).toLowerCase();
                return outPut;







    }











    }






