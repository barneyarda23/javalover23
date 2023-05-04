package day37_StringBuilder;

public class C03_Equals_Compare {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("easy");
        StringBuilder sb4 = new StringBuilder("Hava");
        String str = "Java";


        //System.out.println(sb1 == str);
        //We can not use == relational operation for different data types.

        System.out.println(sb1 == sb2);//false
        System.out.println(sb1 == sb1);//true

        System.out.println(sb1.equals(sb2));//false



        /*
        if we try to compare to different stringBuilders by equals() method. Result will be always false . Because this
        equals method is coming from object class , not from the stringBuilder Class.
         */

        //To Check the equality of StringBuilder object we need to use compareTo()

        System.out.println(sb1.compareTo(sb2)); // 0
        System.out.println(sb1.compareTo(sb3)); // -27
        System.out.println(sb1.compareTo(sb4)); // 2

    }
}
