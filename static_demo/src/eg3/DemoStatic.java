package eg3;

public class DemoStatic {

    //Global Instance or object level variable or object
    int x;
    int y;

    //Global class level variable or object
    static  int z=199;

    public static void main(String[] args) {
        DemoStatic d1=new DemoStatic();
        d1.x=100;
        d1.y=200;
        System.out.println("Printing d1");
        d1.printXYZ();

        z=10000;

        DemoStatic d2=new DemoStatic();
        d2.x=700;
        d2.y=600;
        System.out.println("\nPrinting d2");
        d2.printXYZ();
        System.out.println("\nPrinting d1 again");
        d1.printXYZ();


    }

    public void printXYZ(){
        int m=100; //local to this method
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
    }
}
