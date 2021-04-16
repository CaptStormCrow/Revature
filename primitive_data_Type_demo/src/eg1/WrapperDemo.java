package eg1;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer i=100;
        System.out.println("i = "+i);
        System.out.println(System.identityHashCode(i));
        int x=20;
        i=x; //Autoboxing
        System.out.println("i = "+i);
        System.out.println(System.identityHashCode(i));
        i=99;
        x=i;
        System.out.println("x = "+x);
        System.out.println(System.identityHashCode(i)); //To get address of any Java Object

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        String s="123"; //Java reads everything as String and Java writes everything as String
        Integer d=Integer.parseInt(s);
        System.out.println("d = "+d);

        String m=d+""; //Anything in Java cn be converted to String just by appending +"" to it
        System.out.println("m = "+m);

    }
    //byte short int     long float double char      boolean
    //Byte Short Integer Long Float Double Character Boolean

    //Try the same with Long, Float and Double
}
