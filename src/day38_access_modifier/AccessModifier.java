package day38_access_modifier;

public class AccessModifier {


    //public : Can be reached anywhere from the project
    public static String publicStr = "public string in the project";


    public String publicNonStaticStr = "public non=static string in the project";

    //Private

    private static String privateStr = "private string in the object";

    //default: if you don't add any access modifiers , java will accept it as a default access modifier
    //this data can be reach from the same package , not from anywhere else
    static String defaultStr = "this one is default";

    //protected: it is very similar to default. it can be used in same package and child of the classes from the same package.
    protected  static String protectedStr = "this one is protected";




    public static void main(String[] args) {
        System.out.println(publicStr);
        System.out.println(privateStr);
        System.out.println(defaultStr);
        System.out.println(protectedStr);


    }



    }
