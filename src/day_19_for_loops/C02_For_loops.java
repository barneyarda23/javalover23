package day_19_for_loops;

import java.util.Scanner;

public class C02_For_loops {
    public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);
//
//        System.out.println("Please provide a string");
//
//        String str = scan.nextLine();
//
//        String reversedStr = "";
//        int lastIndex = str.length()-1;
//
//
//        for(int i =lastIndex; i>=0; i--) {
//
//            reversedStr = reversedStr + str.charAt(i);
//
//
//        }
//        System.out.println("REVERSED STRING: " + reversedStr);
        System.out.println(reverseString("javalama") + "RETURNTYPE IS STINRG");

    }
    //2.way

    public static String reverseString (String str){

        String reversedStr= "";
        int lastIndex = str.length()-1;

        for (int i =lastIndex; i>=0; i--){
            reversedStr = reversedStr + str.charAt(i);

        }



        return reversedStr;



    }


}
