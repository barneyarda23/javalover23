package day38_access_modifier;

public class AccessModifierTester {
    public static void main(String[] args) {

        //public

        System.out.println(AccessModifier.publicStr); // Since it is static I have reached through the class name

        AccessModifier ac = new AccessModifier();//Since the variable is non-static I have reached through the object
        System.out.println(ac.publicNonStaticStr);

        //private
         //AccessModifier.privateStr; //

        //default
        System.out.println(AccessModifier.defaultStr);

        //protected
        System.out.println(AccessModifier.protectedStr);

    }


}
