package day25_Arrays;

import java.util.Arrays;

public class C02_IncreaseAllElements {
    public static void main(String[] args) {

        // create a method that increase all elements of an int array by a given number?
        //exp. {1,3,4} -> 3 => {4,6,10}


        int[] testArray = {1, 2, 3, 4};

        int[] updatedTestArray = increaseAllElementOfArray(testArray, 3);

        System.out.println(Arrays.toString(updatedTestArray));


    }


    public static int[] increaseAllElementOfArray(int[] intArray, int changeAmount) {

        for (int i = 0; i <= intArray.length - 1; i++) {

            intArray[i] = intArray[i] + changeAmount;


        }
        return intArray;
    }
}






