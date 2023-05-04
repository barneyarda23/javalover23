package day21_method_overload;

public class C02_MethodOverloading {
    public static void main(String[] args) {


        String str = "Java is everything";

        System.out.println(str.substring(5));//for the same method we can have different steps
        System.out.println(str.substring(5,8));// number of argument/parameters

        System.out.println(str.replace('a', 'o'));// for the same method we can have steps for changing data types
        System.out.println(str.replace("is", "are"));


    }
}
