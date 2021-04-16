package eg1;
public class Demo1 {
    public static void main(String[] args) {
        int ar[]={12,23,41,2,3,4,1,4,4,5}; //create
        System.out.println(ar[0]);//read
        System.out.println("Accessing using foreach");
        for (int a:ar){
            System.out.print(a+" "); //read
        }
        System.out.println("\nAccessing using normal for loop");
        for (int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");//read
        }

        //update ALL even numbers in array to -1
        System.out.println("\n\nArray after update");
        for (int i=0;i<ar.length;i++){
        //    System.out.print(ar[i]+" ");//read
            if(ar[i]%2==0){
                ar[i]=-1; //update
            }
        }
        for (int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");//read
        }

    }
}
