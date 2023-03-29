package day02;

public class C03_VariableTypes {

    public static void main(String[] args) {

        double doubleNumber = 2.01234567890123456789d; //it only prints upto 17 numbers


        System.out.println(doubleNumber);

        float floatNumber;
        floatNumber = 2.01234567890123456789f;
        System.out.println(floatNumber);

        int intNumber = 2;
        System.out.println(intNumber);
    //long int = 5; You cannot use key words as varibale name
        // int intNum ber = 2; it should be no space for variable name
        // no speacial chars for  varibale name

        boolean myBooleanVariable = true;
        System.out.println(myBooleanVariable);
        char myChar = 'A';
        System.out.println(myChar);

        String text = "Jhon Doe";
        System.out.println(text);



    }
}
