package eg2_real_objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product(100,"TV",23.33,2.2f,5));
        productList.add(new Product(123,"TV",223.33,1.2f,1));
        productList.add(new Product(140,"TV",233.33,2.2f,2));
        productList.add(new Product(108,"TV",233.33,1.2f,0));
        productList.add(new Product(120,"TV",213.33,3.2f,0));
        productList.add(new Product(141,"TV",233.33,4.2f,3));

        System.out.println("Printing all the products");
        printProductList(productList);

        Collections.sort(productList);

        System.out.println("\nPrinting all the products sorted based on ID");
        printProductList(productList);

        Collections.sort(productList,(p1,p2)->{
          Float f1=p1.getRating();
          Float f2=p2.getRating();
          return f2.compareTo(f1);
        });

        System.out.println("\nPrinting all the products sorted based on Rating highest to lowest");
        printProductList(productList);

        Collections.sort(productList,(p1,p2)->{
            Double d1=p1.getCost();
            Double d2=p2.getCost();
            int x=d1.compareTo(d2);
            if(x==0) {
                Float f1 = p1.getRating();
                Float f2 = p2.getRating();
                x = f2.compareTo(f1);
            }
            return x;
        });

        System.out.println("\nPrinting all the products sorted based on Cost low to highest and if 2 or more costs are same then by rating highest to lowest");
        printProductList(productList);
    }

    public static void printProductList(List<Product> productList){
        for (Product p:productList) {
            System.out.println(p);
        }
    }
}
