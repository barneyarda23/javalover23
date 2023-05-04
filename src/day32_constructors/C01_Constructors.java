package day32_constructors;

import day24_scope_and_arrays.C04_ADoctor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Constructors {
    public static void main(String[] args) {

        /*
        An Object can be created from a class
        When we want to create an object from a class , the object data type will be class we created the object.

        Constructors will be used  create the object from the class.
        Constructors features:
        1) They look like methods but
         they are not method because they don't have return type.
        2) Constructors also helps to invade the values
        3) Cons. will have same name with the class
        4) they can have some args
        5) java has default cons.  that is not visible in every java page.
        6) Important note**** : Java will delete the default constructor once we create a new const.
                                Also, we must code the default cons. before we start using new const.





         */

        Scanner scan = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        C04_ADoctor doctor1 = new C04_ADoctor();
        C04_ADoctor doctor2 = new C04_ADoctor();
        C04_ADoctor doctor3 = new C04_ADoctor();

        Random random1 = new Random();




    }
}
