package eg_varArgs;

import java.util.Arrays;

public class VarArgsDemo {
    public static void main(String[] args) {
        /*
        Var Args -> Variable Arguments  ...
        ->it is applicable on the parameter of any method
        -> it should and must be the last parameter
        -> only and only one parameter of this type is allowed for a method
         */
        System.out.println("No args to var args result is : "+helloVarArgs());
        System.out.println("2 args for var args result is : "+helloVarArgs(22,33));
        System.out.println("5 args for var args result is : "+helloVarArgs(11,44,100,22,33));
        System.out.println(helloVarArgs2(2));
        System.out.println(helloVarArgs2(2,8,8,9,1,2));
    }

    public static int helloVarArgs(int ...a){
        if(a.length==0){
            return 0;
        }else{
            int sum=0;
            for(int x:a){
                sum+=x;
            }
            return sum;
        }
    }

    public static int helloVarArgs2(int y,int ...a){
        System.out.println(Arrays.toString(a));
        if(a.length==0){
            return 0;
        }else{
            int sum=0;
            for(int x:a){
                sum=sum+(x*y);
            }
            return sum;
        }
    }
}
