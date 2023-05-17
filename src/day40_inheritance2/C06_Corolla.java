package day40_inheritance2;

public class C06_Corolla extends C05_Toyota{




    public C06_Corolla() {
        super("2023modal");

        System.out.println("COROLLA class constructor without any parameter");
    }


    public C06_Corolla(int num) {
        super();
        System.out.println("COROLLA  class constructor with int parameter");


    }

    public C06_Corolla(String str) {
        super();
        System.out.println(str + "COROLLA  class constructor with String parameter");


    }
    public C06_Corolla(int num , String str) {
        super();
        System.out.println("COROLLA  class constructor with String  and int parameter");
    }

    public static void main(String[] args) {

        C06_Corolla newCorolla = new C06_Corolla(25,"LE");
    }
}




