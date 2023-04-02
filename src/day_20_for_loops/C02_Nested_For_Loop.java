package day_20_for_loops;

public class C02_Nested_For_Loop {
    public static void main(String[] args) {


        int number = 4;

        for (int j=1; j<=number; j++){




            for (int i = 1; i <= 4; i++) {
                System.out.print(j + "*" + i + " ");


            }

            System.out.println();

        }
    }
}
