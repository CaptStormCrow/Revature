package eg2;

public class Player extends Person{
    private String game;
    private double avgScore;

    public Player(int id, String name, int age, String game, double avgScore) {
        super(id, name, age);
        this.game = game;
        this.avgScore = avgScore;
    }
    //Player plays for a Team
    //Coach is a Person
    //Team has a Coach
}
