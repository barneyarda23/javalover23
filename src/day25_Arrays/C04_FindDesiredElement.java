package day25_Arrays;

import java.util.Arrays;

public class C04_FindDesiredElement {
    //check if the desired element is in the side of an array, create a method for this goal.
    public static void main(String[] args) {

        int [] intArray = {2,4,5,3,4,6};
        int  desiredNumber = 4;

        printIfArrayHasElement(intArray,desiredNumber);

        String [] strArray = {"John", "Alex" , "Chris"};
        String desiredStr = "Alex";

        printIfArrayHasElement2(strArray,desiredStr);




    }

    public static void printIfArrayHasElement(int [] intArray , int desiredNumber){



        for(int i=0; i<=intArray.length-1; i++){
            if (intArray[i]==desiredNumber){

                System.out.println("yes , it has desired number");

        }





            }


                    }
    public static void printIfArrayHasElement2(String[] strArray , String desiredNumber){

        int flag = 0;

        for(int i=0; i<=strArray.length-1; i++){


        if (strArray[i].equals(desiredNumber)){
           flag++;
        }

        }
        System.out.println(flag + " times array has desired " + desiredNumber);
    }






    }




