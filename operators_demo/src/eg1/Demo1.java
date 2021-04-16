package eg1;
public class Demo1 {
    public static void main(String[] args) {

        int x=10;
        int y=100;
        System.out.println("pre = "+(++x)); //pre increment
        System.out.println("post = "+(x++)); //post increment
        System.out.println("x = "+x);

        System.out.println("x+y = "+(x+y));

        x*=100;  // x=x*100
        System.out.println("x = "+x+" y = "+y);

        System.out.println("x>y "+(x>y));
        System.out.println("x>=1200 "+(x>=1200));
        System.out.println("x==y "+(x==y));

        if (x>y){
            System.out.println("yes x is greater than y");
        }else {
            System.out.println("x is smaller than y");
        }
            x=1999;
        if(x>y && x%2==0){
            System.out.println("Yes x is greater than Y and x is even as well");
        }else{
            System.out.println("either x is less than y or x is not even");
        }

        if(x>y || x%2==0){
            System.out.println("Yes x is greater than Y or x is a even number ");
        }else{
            System.out.println("x is not greater than y or x is not even too.");
        }
    }

    /*
    Operators - helps you perform some logical, relational and comparisions between the
    java variables.
    1)Arithmetic - + - * / %
    2)Relational  > < >= <=   ==  !=
    3)Logical  &&   ||  !
    4)Assignment =
       - Short Circuit - +=  -=  /=  %=
    5)Unary   ++    --
    6)Bitwise    &    |  ^  >> <<


     */
}
