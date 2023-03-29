package day16_string_manipulations;
 /*

    Regex ( Regular Expressions )
    \\s : space 		\\S : everything that is not space 		\\s+ : multiple spaces side by side
    \\d : digits 		\\D : everything non-digit
    \\w : letter or number 	\\W : anything that is not a letter or number

     */

public class C05_ReplaceAll {
    public static void main(String[] args) {

        String str = "J123ava6587 i#$%is very fun  67867ny";
        System.out.println(str);
        //Clean str from number

        str = str.replaceAll("\\d", "");// replaces all numbers with nothing
        System.out.println(str);

        str = str.replace(" ", "5");//I have replaces space with 5
        System.out.println(str);

        str = str.replaceAll("\\W", "");//cleared all but numbers and letters
        System.out.println(str);

        str = str.replaceAll("\\d", " ");//replace all digits with space
        System.out.println(str);

        str = str.replaceAll("\\s+"," ");
        System.out.println(str);

        //if you want to change group of characters, you can use regex. With replace all method.



    }
}
