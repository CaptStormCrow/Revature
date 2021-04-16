package eg_java8;

public class OldStyle implements MyFunctional{
    @Override
    public void hello() {
        System.out.println("Hello from old style");
    }

    public static void main(String[] args) {
        MyFunctional m=new OldStyle();
        m.hello();

        //Anonymous inner classes
        MyFunctional m1=new MyFunctional() {
            @Override
            public void hello() {
                System.out.println("Hello anonymous");
            }
        };
        m1.hello();

        MyFunctional m2=new MyFunctional() {
            @Override
            public void hello() {
                System.out.println("Hello anonymous again....");
            }
        };
        m2.hello();
    }
}
