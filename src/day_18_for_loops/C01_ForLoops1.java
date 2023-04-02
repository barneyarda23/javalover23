package day_18_for_loops;

public class C01_ForLoops1 {
    public static void main(String[] args) {

        //let's create a method that print even numbers from 1 to untill a given value.

        evenNumbersMethod(56);

//         //1.way
//        int givenNumber = 36;
//
//        for (int i = 0; i<=givenNumber; i++){
//            if(i%2==0){
//                System.out.print(i + " ");
//            }
//        }


    }


    //2.way

    public static void evenNumbersMethod(int givenNumber) {

        for (int i = 0; i <= givenNumber; i++) {

            if (i % 2 == 0) {
                System.out.println(i + "");

            }
        }
    }

}







