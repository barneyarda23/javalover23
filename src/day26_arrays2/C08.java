package day26_arrays2;

import java.util.Arrays;

public class C08 {
    public static void main(String[] args) {

        // sum same index into new array



            int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

            ayniIndexTopla(arr);
        }

        public static void ayniIndexTopla (int[][] arr) {

            int[] sumArray = new int[3]; // [0, 0, 0]

            for (int i = 0; i <arr.length; i++) {
                for (int j = 0; j <arr[i].length; j++) {
                    sumArray[j] +=arr[i][j];


                }

            }
            System.out.println(Arrays.toString(sumArray));
        }

    }


