package day26_arrays2;

import java.util.ArrayList;
import java.util.List;

public class C06 {
    public static void main(String[] args) {

        int[] arr = {3,6,9,5,6,3,12,5,9,1};
        System.out.println(tekrarEtmeyenlist(arr));



    }
    public static List<Integer> tekrarEtmeyenlist (int[] arr){

        List<Integer> bosArray = new ArrayList<>(); //bos bir list olusturduk.

        for(int i = 0; i< arr.length; i++){
            if(!bosArray.contains(arr[i])){
                bosArray.add(arr[i]);

            }
        }


        return bosArray;






    }
}
