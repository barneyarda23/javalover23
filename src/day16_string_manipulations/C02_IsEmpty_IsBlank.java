package day16_string_manipulations;

public class C02_IsEmpty_IsBlank {
    public static void main(String[] args) {

        String str = "Java is the life";
        System.out.println(str.isEmpty());//FALSE
        System.out.println(str.isBlank());//FALSE

        String str2 = " ";
        System.out.println(str2.isEmpty());//false
        System.out.println(str2.isBlank());//true
        String str3 = "";
        System.out.println(str3.isBlank());

        System.out.println(str.length());//16
        System.out.println(str2.length());//1
        System.out.println(str3.length());//0


    }
}
