package eg2;

public class Player {
    private int id;
    private String name;
    private int age;
    private long contact;
    private String email;

    public Player(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Player(int id,String name,int age,long contact,String email){
        this(id,name); //constructor chaining
        this.age=age;
        this.contact=contact;
        this.email=email;
    }
    public  Player(){} //best practice

    public void printPlayer(){
        System.out.println("Printing player details");
        System.out.println("Player id : "+id);
        System.out.println("Player Name : "+name);
        System.out.println("Player Age : "+age);
        System.out.println("Player contact : "+contact);
        System.out.println("Player Email : "+email);
    }
}
