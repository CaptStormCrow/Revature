package eg1;

import java.util.*;

public class Demo1 {

    public static void main(String[] args) {
    Map<Integer,String> hm=new HashMap<>();
        hm.put(12,"Jee");
        hm.put(120,"Java");
        hm.put(14,null);
        hm.put(142,"Jee");
        hm.put(122,null);
        hm.put(110,"Jee");
        hm.put(null,"Jave");
        hm.put(129,"Jee");
        hm.put(212,null);
        hm.put(132,"Jee");
//Key is null or value is null or key is multiples of 10

        System.out.println("Before Deletion");
        System.out.println(hm);

//        for(Map.Entry<Integer,String> e:hm.entrySet()){
//            if(e.getKey()==null || e.getValue()==null || e.getKey()%10==0){
//                hm.remove(e.getKey());
//            }
//        }
        Iterator<Map.Entry<Integer,String>> i=hm.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry<Integer,String> e=i.next(); //read and post increment
            if(e.getKey()==null || e.getValue()==null || e.getKey()%10==0){
               i.remove();
            }
        }


        System.out.println("After Deletion");
        System.out.println(hm);

        List<Integer> li= Arrays.asList(12,2,3,4,4,4,41,2,31,1,4,1);
        Iterator<Integer> i2=li.iterator();
        while (i2.hasNext()){
            System.out.println(i2.next());
        }
//Enumerator -> read operation from top to bottom
        //Iterator -> read and remove from top to bottom
        //ListIterator -> applicable only on List interface, can traverse both the side and can do read, add and remove

        //If a collection is iterable, then it can be iterated using an iterator (and consequently can be used in a for each loop.) The iterator is the actual object that will iterate through the collection.
    }
}
