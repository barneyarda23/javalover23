package day40_inheritance2;

public class C05_Toyota extends C04_Car{




    public C05_Toyota() {
        super();
        System.out.println("toyota class constructor without any parameter");
    }


    public C05_Toyota(int num) {
        super();

        System.out.println("toyota class constructor with int parameter");


    }

    public C05_Toyota(String str) {

        super();
        System.out.println(str + "toyota class constructor with String parameter");


    }
    public C05_Toyota(int num , String str) {

        super();
        System.out.println("toyota class constructor with String  and int parameter");
    }
}

