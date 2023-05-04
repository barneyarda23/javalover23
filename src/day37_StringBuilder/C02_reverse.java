package day37_StringBuilder;

public class C02_reverse {

    //reverse a string using StringBuilder class
    public static void main(String[] args) {

        String str = "Java is beautiful";
        System.out.println("String to reverse " + str);

        StringBuilder sb = new StringBuilder(str);
        System.out.println("original sb :" + sb);
        System.out.println("reversed string  builder" + sb.reverse());

        System.out.println(sb);//lufituaeb si avaJ StringBuilder is mutable
        System.out.println(str);//Java is beautiful String is immutable

    }
}
