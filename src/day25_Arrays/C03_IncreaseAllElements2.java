package day25_Arrays;

import java.util.Arrays;

public class C03_IncreaseAllElements2 {
    public static void main(String[] args) {

        int[] arr1 = {2, 4, 6, 8};
        int changer = 3;

        int[] updateArray = C02_IncreaseAllElements.increaseAllElementOfArray(arr1, changer);
        System.out.println(Arrays.toString(updateArray));//[5, 7, 9, 11]


    }
}