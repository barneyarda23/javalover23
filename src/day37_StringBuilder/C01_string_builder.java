package day37_StringBuilder;

public class C01_string_builder {
    public static void main(String[] args) {

        String str = "Ali can";
        System.out.println(str);//Ali Can


        //1.Way of creating an object from StringBuilder
        StringBuilder sb1 = new StringBuilder();

        System.out.println(sb1.capacity());//16
        System.out.println(sb1.length());//0

        //2.Way of creating an object from StringBuilder
        StringBuilder sb2 = new StringBuilder("Ali Can");
        System.out.println(sb2);//Ali Can

        System.out.println(sb2.capacity());//23
        System.out.println(sb2.length());//7

        sb1.append("YilmazTurk");
        System.out.println(sb1); //YilmazTurk
        System.out.println(sb1.capacity());//16
        System.out.println(sb1.length());//10

        sb1.append("MUstafa");
        System.out.println(sb1); //YilmazTurkMUstafa
        System.out.println(sb1.capacity());//34 34 = 2* 16(oldCapacity) +2
        System.out.println(sb1.length());//17

        //3.Way of creating an object from StringBuilder

        StringBuilder sb3 = new StringBuilder(7);
        System.out.println(sb3.capacity());//7
        System.out.println(sb3.length());//0

        sb3.append("12345678"); //12345678
        System.out.println(sb3);
        System.out.println(sb3.capacity());//16
        System.out.println(sb3.length());//8

        //trim : : to delete unused place by StringBuilder , to save memory.

       sb3.trimToSize();
        System.out.println(sb3.capacity());//8
        System.out.println(sb3.length());//8








    }
}
