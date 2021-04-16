package eg1;
public class Demo1 {
    public static void main(String[] args) {
        for (int i=0,j=10;i<10;i++,j--){
            System.out.println("i="+i+" j = "+j);
        }

        int x=0;
        while(x!=10){
            System.out.println("x = "+(x++));
        }
        int m=10;
        do {
            System.out.println("I will be executed once for sure");
        }while(m!=10);

        while (m!=10){
            System.out.println("I will be executed only and only if m!=10");
        }
        int ar[]={12,23,11,22,3,4,5,65,6,1,2,3};
        System.out.println("Printing array using for each loop");
        for(int a:ar){
            System.out.print(a+" ");
        }

        System.out.println("\nprinting array using normal for loop");
    for (int i=0;i<ar.length;i++){
        System.out.print(ar[i]+" ");
    }
        System.out.println();
    for (int i=0;i<5;i++){
        for(int j=0;j<3;j++){
            System.out.println("i = "+i+" j = "+j);
        }
    }

        int day=2;
    switch (day){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        default:
            System.out.println("Some other day");
    }
    }
}
