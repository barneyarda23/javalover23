package day04;

import java.util.Scanner;

public class C04_ScannerQuestion4 {
    public static void main(String[] args) {

        //Question 4- Take the length of 2 sides of a rectangle from the user        // and print the area of the rectangle

        Scanner rectangle = new Scanner(System.in);

        System.out.println("Pls enter the width rectangle");
        double width = rectangle.nextDouble();
        System.out.println("Pls enter the length rectangle");
        double length = rectangle.nextDouble();

        double areaOfRectangle = width*length;
        System.out.println(areaOfRectangle);







    }
}
