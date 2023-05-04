package day31_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

// Question 5- Write a program that compares the elements of the two given arrays
// and returns the elements common to both of them as a separate list.
// use for each
public class C05_Finding_common_elements {
    public static void main(String[] args) {

        int[] arr1 = {2,3,6,7};
        int[] arr2 = {3,9,6,3};

        commonElements(arr1,arr2);




    }
    public static void commonElements(int[] arr1, int[]arr2){
        List<Integer> commonlist = new ArrayList<>(); // []

        for (int each1 : arr1){
            for (int each2 : arr2){
                if(each1==each2 && !commonlist.contains(each1)){
                    commonlist.add(each1);
                }



            }
        }

        System.out.println(commonlist);



    }
}
