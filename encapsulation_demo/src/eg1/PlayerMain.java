package eg1;

public class PlayerMain {
    public static void main(String[] args) {

        Player p1=new Player();
        //p1.id=100;
        p1.setId(200);
        p1.setName("Jay");
        p1.setAge(22);

        printPlayer(p1); //call by reference or pass by reference


    }
    public static void printPlayer(Player player){
        System.out.println("Printing player");
        System.out.println("Id : "+player.getId());
        System.out.println("Name : "+player.getName());
        System.out.println("Age : "+player.getAge());
    }
}
