package day27_ArraysAndMda;

import java.util.Arrays;

public class C05_MDA2 {
    public static void main(String[] args) {

        String[][] classes = {{"A", "B", "G", "M"}, {"F", "P", "A", "V"}, {"K", "D", "Q"}};
        // print G
        System.out.println(classes[0][2]);//G

        //Change Q With Y

        classes[2][2] = "Y";
        System.out.println(Arrays.deepToString(classes));//[K, D, Y]]


        //Calculate the total number of students
        int sum = 0;
        for (int i = 0; i < classes.length; i++) {
            sum = sum + classes[i].length;

        }
        System.out.println("Total students" + sum); //Total students11

    }
}

