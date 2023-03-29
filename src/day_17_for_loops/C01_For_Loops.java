package day_17_for_loops;

public class C01_For_Loops {
    //Note: println -> prints to next line while print command prints in the same line
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Java is money - ");
        }

        //let's print numbers 1-100 with the for loop

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // to go to next line
        // let's print numbers 100-1 with the for loop

        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");


        }
    }
}
