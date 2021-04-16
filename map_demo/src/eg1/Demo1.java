package eg1;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Map<Integer,String> hm=new HashMap<>();
        hm.put(100,"Jane");
        hm.put(100,"updated");
        hm.put(null,"jay");
        hm.put(3900,"jay");
        hm.put(1900,"jay");
        hm.put(390,null);
        hm.put(900,null);
        hm.put(2900,"dinesh");
        hm.put(5900,"dan");
        System.out.println("hm -> "+hm);

        Map<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(100,"Jane");
        lhm.put(100,"updated");
        lhm.put(null,"jay");
        lhm.put(3900,"jay");
        lhm.put(1900,"jay");
        lhm.put(390,null);
        lhm.put(900,null);
        lhm.put(2900,"dinesh");
        lhm.put(5900,"dan");
        System.out.println("lhm -> "+lhm);


        Map<Integer,String> tm=new TreeMap<>(); //Pass Collections.reverseOrder() as a parameter in TreeMap's constructor if you want to do the sorting in descending
        tm.put(100,"Jane");
        tm.put(100,"updated");
       // tm.put(null,"jay");
        tm.put(3900,"jay");
        tm.put(1900,"jay");
        tm.put(390,null);
        tm.put(900,null);
        tm.put(2900,"dinesh");
        tm.put(5900,"dan");
        System.out.println("tm -> "+tm);

        Map<Integer,String> ht=new Hashtable<>();
        ht.put(100,"Jane");
        ht.put(100,"updated");
       // ht.put(null,"jay");
        ht.put(3900,"jay");
        ht.put(1900,"jay");
      //  ht.put(390,null);
      //  ht.put(900,null);
        ht.put(2900,"dinesh");
        ht.put(5900,"dan");
        System.out.println("ht -> "+ht);

        System.out.println(ht.size());
        System.out.println(ht.get(1000));
        System.out.println(ht.get(5900));

        System.out.println(ht.containsKey(1900));
        System.out.println(ht.containsValue("dan"));

        System.out.println(ht.keySet());
        System.out.println(ht.values());

        Set<Integer> set=ht.keySet();
        System.out.println("Traversing using keySet()");
        for(Integer i:set){
            System.out.println("Key is : "+i+" Value is : "+ht.get(i));
        }
        System.out.println("\nTraversing using Entry entrySet()");
        for(Map.Entry<Integer,String> e:ht.entrySet()){
            System.out.println("Key -> "+e.getKey()+" Value -> "+e.getValue());
        }

        ht.remove(100);
        System.out.println("ht - > "+ht);
    }
}
