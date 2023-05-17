package day40_inheritance2;

public class C04_Car {

    public C04_Car() {

        System.out.println("Car class constructor without any parameter");
    }


    public C04_Car(int num) {

        System.out.println("Car class constructor with int parameter");


    }

    public C04_Car(String str) {

        System.out.println("Car class constructor with String parameter");


    }
    public C04_Car(int num , String str) {

        System.out.println("Car class constructor with String  and int parameter");
}
}