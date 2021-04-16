package eg1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Accessing implementor using MyInterface1");
        MyInterface1 i1=new Implementor();
        i1.common();
        i1.method1();
        i1.method2();
        i1.method3();


        System.out.println("\n\nAccessing implementor using MyInterface2");
        MyInterface2 i2=new Implementor();
        i2.common();
        i2.hello1();
        i2.hello2();
    }
}
