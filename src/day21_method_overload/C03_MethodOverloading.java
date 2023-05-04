package day21_method_overload;

public class C03_MethodOverloading {

    // How does java find the method.
    /*
    1) it will check the names
    2) it will check the arguments/ parameters. if they %100 match with the parameters.
    3) Can java handle the situation by auto casting
    4) Java will pick the easiest one (if less casting)

     */

    //on the same java class
    //How we can achieve method overloading
    //1) by using different number of parameters
    //2) by using different data types





    public static void main(String[] args) {

        add(4, 5);

        add(3.4, 4.5);

        add(3, 6, 7);

        add(5.1, 9);

        add("ali", "Can");


    }

    public static void add(int a, int b) {


        System.out.println("the sum of two integers : " + (a + b));


    }

    public static void add(double a, double b) {


        System.out.println("the sum of two doubles : " + (a + b));


    }

    public static void add(int a, int b, int c) {


        System.out.println("the sum of three integers : " + (a + b + c));
    }

    public static void add(int a, double b) {


        System.out.println("the sum of two integer and a double : " + (a + b));
    }

    public static void add(String a, String b) {


        System.out.println("the sum of two Strings : " + (a + b));

    }
}