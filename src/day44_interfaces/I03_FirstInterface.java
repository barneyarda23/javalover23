package day44_interfaces;

public interface I03_FirstInterface {


    static int num = 12;

    /*
    1) Interface is not classes , it is interface.
    2) Best feature of an interface is allowing multiple parents.
    3) All method inside an interface  have to be abstract with no method body ,even if abstract key word is not used.(this is the reason why Interface are called full abstract.
    4) All interface methods are public.
    5) If you want an Interface to be the parent of a class instead of "extend" use "implements".
    6) If a class has two parent interface. Both can have the same name same return type method. Java will not complain.It will use one of them.
    However, if the return types are different, java will complain. It needs to be fixed in Interfaces.
    7) All variables in Interfaces are public final and static.
    8) Like abstract classes , we cannot create object from interfaces.
    9) Interface doesn't have to override from parent Interface
    Abstract class , doesn't have to override from parent Interface.(Like abstract class doesn't have to override from a parent abstract class)
    ***CONCRETE class has to override from parent Interface.

    Child                   Parent
    10) Concrete class ==> interface : implement.
        Abstract class ==> interface : implement.
        Interface ==> interface : extends.
        Interface ==> Concrete class : This is not allowed in Java.(A class cannot be a parent of an interface)
        Interface ==> Abstract class : This is not allowed in Java.(A class cannot be a parent of an interface)

     */


    void method1();
    public void method2();
    public abstract  void method3();

    }

