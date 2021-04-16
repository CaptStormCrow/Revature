package eg1;
public class Demo1 {

    public static void main(String[] args) {
        System.out.println("Hello main()");
        System.out.println("Creating obj1");
        Demo1 d=new Demo1();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Creating obj2");
        Demo1 d2=new Demo1();
    }

    public Demo1() {
        System.out.println("Hello constructor");
    }

    {
        System.out.println("Hello anonymous block");
    }
    static{
        System.out.println("I am before main");
        //create a thread
    }


}
