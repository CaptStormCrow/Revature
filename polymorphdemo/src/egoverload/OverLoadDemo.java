package egoverload;
public class OverLoadDemo {
    public static void main(String[] args) {

        Calculator c=new Calculator();
        c.add(100,222,3333);
        System.out.println(c.add(22,33));
        System.out.println(c.add(22.45f,11.22f));
    }
}
