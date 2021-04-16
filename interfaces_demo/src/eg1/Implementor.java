package eg1;

public class Implementor implements  MyInterface1,MyInterface2{
    @Override
    public void method1() {
        System.out.println("method1() from MyInterface1 x = "+MyInterface1.x);
    }

    @Override
    public void method2() {
        System.out.println("method2() from MyInterface1");
    }

    @Override
    public void method3() {
        System.out.println("method3() from MyInterface1");
    }

    @Override
    public void hello1() {
        System.out.println("hello1() from MyInterface2 x = "+MyInterface2.x);
    }

    @Override
    public void hello2() {
        System.out.println("hello2() from MyInterface2");
    }

    @Override
    public void common() {
        System.out.println("common() for MyInterface1 and MyInterface2");
    }
}
