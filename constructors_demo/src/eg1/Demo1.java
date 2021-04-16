package eg1;
public class Demo1 {
    public static void main(String[] args) {

        Calculator c=new Calculator("TEST");
        System.out.println("Everything went good");

        Calculator c1=new Calculator(100,22);
        System.out.println(c1.add());
        System.out.println(c1.multiply());
        System.out.println(c1.subtract());
    }
}
