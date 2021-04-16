package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List lis=new LinkedList();
        lis.add("hello");
        lis.add(12222);
        lis.add(12.3444);
        lis.add('d');
        lis.add(true);

        System.out.println("lis : "+lis);

        List<Integer> li1=new ArrayList<>();
        li1.add(12333);
        li1.add(123);
        li1.add(3333);
        li1.add(133);
        li1.add(null);
        li1.add(12333);
        li1.add(null);
        li1.add(12333);
        li1.add(1233);
        li1.add(123);
        li1.add(null);
        System.out.println("li1 -> "+li1);

        li1.add(1,122);
        System.out.println("li1 -> "+li1);

        System.out.println("li1.size() : "+li1.size());
        li1.set(1,100);
        System.out.println("li1 -> "+li1);
        System.out.println("li1.get(0) : "+li1.get(0));
        System.out.println("Printing contents of List using for loop");
        for (int i=0;i<li1.size();i++){
            System.out.print(li1.get(i)+" ");
        }
        System.out.println();
        Integer i=12333;
        li1.remove(i); //removes the first occurance of i object
        System.out.println("li1 after remove -> "+li1);
        li1.remove(0); //removes the element of particular index
        System.out.println("li1 after remove of particular index -> "+li1);

        Collections.reverse(li1);
        System.out.println("li1 -> "+li1);
        //sort-> before calling sort make sure your collection doesnt have any any null values because null is uncomparable
        while(li1.remove(null)){}
        Collections.sort(li1);
        System.out.println("li1 after sort -> "+li1);
        Collections.sort(li1,Collections.reverseOrder());
        System.out.println("li1 after reverse order sort -> "+li1);

        Collections.sort(li1);
        System.out.println("li1 after sort -> "+li1);
        System.out.println(Collections.binarySearch(li1,123));
        System.out.println(Collections.binarySearch(li1,100));

        System.out.println(li1.contains(100));
        System.out.println(li1.contains(123));

    }
}
