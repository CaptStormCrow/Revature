package eg1;

public class Demo1 {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        System.out.println("s1 = "+System.identityHashCode(s1));
        System.out.println("s2 = "+System.identityHashCode(s2));

        String s3=new String("hello"); //creates outsside the pool
        System.out.println("s3 = "+System.identityHashCode(s3));
        s3=s3.intern(); //brings it back to the pool
        System.out.println("s3 = "+System.identityHashCode(s3));

        String s4=new String("hello");
        System.out.println("s4 = "+System.identityHashCode(s4));

        System.out.println("s1==s2 : "+(s1==s2)); // when we use == operator to compare 2 objects it looks for the address not the value

        System.out.println("s1==s3 : "+(s1==s3));

        System.out.println("s1==s4 : "+(s1==s4));

        System.out.println("s1.equals(s2) : "+s1.equals(s2));
        System.out.println("s1.equals(s3) : "+s1.equals(s3));
        System.out.println("s1.equals(s4) : "+s1.equals(s4));
        System.out.println("s1.equals(\"heyyy\") : "+s1.equals("heyyy"));

        System.out.println("s1.equalsIgnoreCase(\"HEllo\") : "+s1.equalsIgnoreCase("HEllo"));

        System.out.println("s1.length() : "+s1.length());
        System.out.println("s1.charAt(0) : "+s1.charAt(0));

        System.out.println(s1.toUpperCase());
        System.out.println(s1);
        System.out.println("s1.substring(1) : "+s1.substring(1));
        System.out.println("s1.substring(1,4) : "+s1.substring(1,4));

        char ar[]=s1.toCharArray();
        for (char c:ar){
            System.out.print(c+" ");
        }
        String s5="    helooooo    ";
        System.out.println("\n"+s5);
        s5=s5.trim();
        System.out.println(s5);

        String s6="hello hi good evening everyone";
        String s7[]=s6.split(" ");
        for(String s:s7){
            System.out.println(s.toUpperCase());
        }

    }
}
