package eg1;

public class Calculator {
    public Calculator() {
        System.out.println("Hello from Constructor");
    }

    public Calculator(String s) {
        System.out.println("Hello " + s);
    }

    public Calculator(int x, int y) {
        this.x = x; //variable shadowing
        this.y = y;
    }

    //Calculator(){}

    int x;
    int y;

    public int add() {
        return x + y;
    }

    public int multiply() {
        return x * y;
    }

    public int subtract() {
        return x - y;
    }

}
