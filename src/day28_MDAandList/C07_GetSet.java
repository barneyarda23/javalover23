package day28_MDAandList;

import java.util.ArrayList;
import java.util.List;

public class C07_GetSet {
    public static void main(String[] args) {


        /*
        imp not;
        1) list does not accept primitive data type what wht we use wrapper classes.
        2) list is flex in length which allows us to have more ready method.



         */

        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(2);

        System.out.println(numbers); // [3, 5, 2]

        System.out.println(numbers.get(0));//3 get() method how yoy reach the elements of a list.

        numbers.set(0, 10);
        System.out.println(numbers); //[10, 5, 2] set() method is used to update the list element.

        //print the last element of a list

        System.out.println(numbers.get(numbers.size() - 1));//2 - numbers.size() - 1 is the last elements index


    }
}
