package eg2;

public class PlayerMain {
    public static void main(String[] args) {
        Player p1=new Player(100,"Sachin");
        p1.printPlayer();
        System.out.println();
        Player p2=new Player(101,"Raj",22,1234567890,"raj@gmail.com");
        p2.printPlayer();
    }
}
