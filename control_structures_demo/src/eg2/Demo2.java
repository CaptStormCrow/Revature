package eg2;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Printing all even numbers between 1 - 50");
        for (int i=1;i<=50;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.println("\nPrinting all prime numbers between 1 - 50");
        for (int i=1;i<=50;i++){
            if (isPrimeNumber(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static  boolean isPrimeNumber(int n){
        int count=0;
        boolean b=false;
        for (int j=1;j<=n;j++){
            if(n%j==0){
                count++;
            }
        }
        if (count==2){
            b=true;
        }
        return b;
    }
}
