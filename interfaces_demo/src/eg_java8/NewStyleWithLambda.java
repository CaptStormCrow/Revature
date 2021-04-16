package eg_java8;

public class NewStyleWithLambda {
    public static void main(String[] args) {

        //Lambda(->) is applicable only and only on functional interface

        MyFunctional m1=()->{
            System.out.println("Hello Lambda");
        };
        m1.hello();
        MyFunctional m2=()->{
            System.out.println("Hello lamdaaa Againnnn");
        };
        m2.hello();

        AddFunctional a=(x,y,z)->{
          return x+y+z;
        };
        System.out.println(a.sum(100,22,333));
    }
}
