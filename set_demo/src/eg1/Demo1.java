package eg1;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Set<String> hs=new HashSet<>();
        hs.add("hello");
        hs.add("hello");
        hs.add("hey");
        hs.add("java");
        hs.add("jee");
        hs.add("collection");
        hs.add("jse");
        hs.add("navig");
        hs.add(null);
        hs.add(null);
        System.out.println("hs - > "+hs);

        Set<String> lhs=new LinkedHashSet<>();
        lhs.add("hello");
        lhs.add("hello");
        lhs.add("hey");
        lhs.add("java");
        lhs.add("jee");
        lhs.add("collection");
        lhs.add("jse");
        lhs.add("navig");
        lhs.add(null);
        lhs.add(null);
        System.out.println("lhs - > "+lhs);

        Set<String> ts=new TreeSet<>(Collections.reverseOrder());
        ts.add("hello");
        ts.add("hello");
        ts.add("hey");
        ts.add("java");
        ts.add("jee");
        ts.add("collection");
        ts.add("jse");
        ts.add("navig");
        //ts.add(null);
        //ts.add(null);
        System.out.println("ts - > "+ts);
        System.out.println(ts.size());
        System.out.println(ts.contains("hey"));
        System.out.println(ts.contains("heyaaa"));

        for(String s:ts){
            System.out.println(s.toUpperCase());
        }
        ts.remove("navig");
        System.out.println(ts);
    }
}
