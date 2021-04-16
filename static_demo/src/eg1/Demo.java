package eg1;

import eg2.App;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Heyyy from main");

        //static methods of the class can be accessed directly
        helloStatic(); //calling

        //non - static methods of any class we need to create a object and then access it

        //Classname objname =new ConstructorName();
        Demo d=new Demo();
        d.iAmNonStatic();

        App.iAmStaticApp();

        App a=new App();
        a.iAmNonStaticApp();

    }

    //method signature or method defination
    public static void helloStatic(){
        System.out.println("Hello from helloStatic()");
    }

    public void iAmNonStatic(){
        System.out.println("Hello from iAmNonStatic()");

    }
}
