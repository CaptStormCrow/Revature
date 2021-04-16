package eg1;

public class Demo1 {

    public static void main(String[] args) {
    int x=100;
        System.out.println(x);
        System.out.println("x = "+x);

        float f=12.33f;
        System.out.println("f = "+f);
        double d=122.33;
        System.out.println("d = "+d);

        long l=12345678999L;
        System.out.println("l = "+l);

        char c='A';
        System.out.println("c = "+c);


    }

    /*
    Data Type - Its a tyoe of memory what you are asking from the operating system to allocate it for you.
    Java has 8 primitive data types and 8 wrappers as well.
    Wrappers - It wraps up the property of primitive data type to make it as object.

    DataType        Size            Default Value
    -------------------------------------------------
    byte            1byte               0
    short           2bytes              0
    int             4bytes              0
    long            8bytes              0
    float           4bytes              0.0000f
    double          8bytes              0.0000d (java reads all the decimal values by default as double)

    char            2bytes              '\u0000' (Java supports unicode charset)
    boolean         1bit                false
     */
}
