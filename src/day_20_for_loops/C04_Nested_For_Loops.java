package day_20_for_loops;

    /*

             *
             * *
             * * *
             * * * *

     */

public class C04_Nested_For_Loops {
    public static void main(String[] args) {


        for(int i=1; i<=4; i++){
            for (int j=1; j<=i;j++){
                System.out.print("* ");


            }
            System.out.println();
        }

    }
}
