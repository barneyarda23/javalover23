package day44_interfaces;

public class C02_ChildClass extends C01_ParentClass implements I03_FirstInterface , I04_SecondInterface{
    @Override
    public void method4() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {
        System.out.println("Method 2");

    }

    @Override
    public void method3() {

    }

    public static void main(String[] args) {
//        I03_FirstInterface obj = new I03_FirstInterface();// cannot  be instantiated ' is abstract; we can not create object.

        C02_ChildClass childObject = new C02_ChildClass();
        childObject.method2();

        //childObject.num // variables of interfaces cannot be seen through object.

        //I03_FirstInterface.num = 15; // All interface variables are final , that's why cannot be reassigned a value.
    }
}
