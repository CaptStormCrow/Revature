package egoverload;

public class Calculator {

    public int add(int a,int b){
        return a+b;
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public float add(float a,float b){
        return a+b;
    }
}
//Login
//login(String username,String password)
//login(String socialAccount)
//login(long mobilenumber, String password)
//login(long mobilenumber, int otp);
