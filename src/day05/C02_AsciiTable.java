package day05;

import java.util.Scanner;

public class C02_AsciiTable {
    public static void main(String[] args) {

        char myChar = 'A';
        System.out.println(myChar); // A
        System.out.println(myChar + 0); //65

        //Ask user to provide a word and print next letters after the first letter of the word

        Scanner scan = new Scanner(System.in);
        System.out.println("hey user please enter a word");
        String userWord = scan.next();
        System.out.println(userWord);

       char firstLetterWord = userWord.charAt(0);

        System.out.println("next there letters : " +(char)(firstLetterWord+1) + (char)(firstLetterWord+2) + (char)(firstLetterWord+3));

        // when a char sees a math calculation symbol, it will act like a number
        // to be able print number as a char character we should type cast with (char)






    }
}
