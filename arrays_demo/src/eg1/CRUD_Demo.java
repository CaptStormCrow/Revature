package eg1;

public class CRUD_Demo {
    public static void main(String[] args) {
        int ar[]=new int[6];
        System.out.println("ar.length : "+ar.length);
        int n=0; //total elements in my array
        ar[0]=100;
        n++;
        ar[1]=200;
        n++;

        System.out.println("Printing array contents before insertion");
        for (int i=0;i<n;i++){
            System.out.print(ar[i]+" ");//read
        }
        int pos=3;
        int ele=1999;
        for (int i=n;i>pos-1;i--){
            ar[i]=ar[i-1];
        }
        ar[pos-1]=ele;
        n++;
        System.out.println("\nPrinting array contents after insertion");
        for (int i=0;i<n;i++){
            System.out.print(ar[i]+" ");//read
        }
        int delpos=3;
        System.out.println("\nPrinting array contents before deletion");
        for (int i=0;i<n;i++){
            System.out.print(ar[i]+" ");//read
        }
        for(int i=delpos-1;i<n;i++){
            ar[i]=ar[i+1];
        }
        n--;
        System.out.println("\nPrinting array contents after deletion");
        for (int i=0;i<n;i++){
            System.out.print(ar[i]+" ");//read
        }

    }
}
