package day37_StringBuilder;

public class C04_StringBuilder_String_Methods {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Life");
        StringBuilder sb2 = new StringBuilder("Java Life");
        String str = "Java life";

        System.out.println(sb1.substring(5));//Life

        System.out.println(sb1); //Java life

        //str = sb1;
        str = sb1.toString();// toString() method will allow us to convert String builder to a string.
        System.out.println(str);


        System.out.println(sb1.charAt(2));//v
    }
}
