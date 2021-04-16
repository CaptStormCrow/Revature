package eg1;
public class Demo1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        sb.append(" hey").append(" hello ").append(122333).append(12.445).append(false);
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        sb.insert(1,"JAVA");
        System.out.println(sb);
        sb.delete(2,8);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        StringBuffer sb1=new StringBuffer("JAVA");
        StringBuffer sb2=new StringBuffer("JAVA");

        System.out.println(sb1.equals(sb2));

        System.out.println(sb1.toString().equals(sb2.toString()));
    }
}
