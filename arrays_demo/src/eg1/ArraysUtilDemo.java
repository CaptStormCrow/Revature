package eg1;

import java.util.Arrays;

public  class ArraysUtilDemo {
    public static void main(String[] args) {
        int ar[]={12,11,33,113,4,5,67,9,9,123,1,3};
        System.out.println(ar);
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        int ar1[]=Arrays.copyOf(ar,ar.length+5);
        System.out.println("ar1 -> : "+Arrays.toString(ar1));
        //binarySearch -> prerequiste for binarysearch is-> the array should and must be sorted in ascending order only

        System.out.println(Arrays.binarySearch(ar,555));
        System.out.println(Arrays.binarySearch(ar,9));

    }

    private  class A{}
    public static class M{}
}
