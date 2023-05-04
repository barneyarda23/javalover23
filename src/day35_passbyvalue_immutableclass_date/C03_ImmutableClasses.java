package day35_passbyvalue_immutableclass_date;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClasses {
    public static void main(String[] args) {


        //String and wrapper classes are immutable so, whatever we do we  can not change the original value.
        /*
        When we create an object from a class it cloud be mutable or immutable.
        String -- immutable
        StringBuilder -- mutable
        StringBuffer -- mutable

        -if we use immutable class to create an object. The object will be immutable.
        -as long as new value is *not assigned immutable data original value can not be changed.
        -even if you use a method.

        -everytime we use a method immutable object, Java creates a new object.
        --unused object are cleaned by java using garbage collector.
         */



        String str = "Java is getting funnier everyday";

        str.substring(5);
        str.substring(10,12);
        str.startsWith("java");
        str.toLowerCase();
        str.toUpperCase();

        str = str.toUpperCase();//JAVA IS GETTING FUNNIER EVERYDAY we make  assignment .
        str = str.substring(5);//IS GETTING FUNNIER EVERYDAY

        System.out.println(str);//Java is getting funnier everyday


        //to change an immutable variable we need a assign it to new value.

        List<Integer> numbers = new ArrayList<>(); //[]
        System.out.println(numbers);

        numbers.add(5);
        numbers.add(9);

        System.out.println(numbers);//[5, 9]

        numbers.set(0,7);
        numbers.remove(1);

        System.out.println(numbers);//[7]

        //Whit-out any assignment , just using a method we are able to change the original value.
        //this means data is mutable.


    }
}
