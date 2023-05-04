package day26_arrays2;

import java.util.Arrays;

//    Question 3- (Interview) Create a method that will shift all the elements in a given array to the right
//    and move the last element to the beginning, save the array as new.
//    Orn : input : [4,5,6,7] is the final state of the array. : [7,4,5,6]
public class C01_Question1 {
    public static void main(String[] args) {

        int[] intArr = {4,5,6,7};

        int tempBox = intArr[intArr.length-1];

        /*
        intArr[3]=intArr[2];
        intArr[2]=intArr[1];
        intArr[1]=intArr[0];
        intArr[0]=intArr[7];

        */

        for(int i =0; i < intArr.length-1; i++){

            int lastIndex = intArr.length-1;

            intArr[lastIndex-i] = intArr[lastIndex-1-i]; // update all elements but 0th index.

        }
        intArr[0] = tempBox;//updating 0 index




        System.out.println(Arrays.toString(intArr));//printing new Array.





    }













}
