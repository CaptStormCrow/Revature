package eg_java8;

public class Main implements NewJava8Interface,NewJava8Interface2{

    public static void main(String[] args) {
        NewJava8Interface n=new Main();
        n.helloDefault();
        NewJava8Interface.helloStatic();
    }

    @Override
    public void helloDefault() {

    }
}
