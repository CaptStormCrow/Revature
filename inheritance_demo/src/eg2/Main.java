package eg2;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person(100,"Dinesh",22);
        System.out.println(p1); //p1.toString()
       // System.out.println(p1.toString());
        //System.out.println(System.identityHashCode(p1));

        Project p2=new Project(9999,"Banking App","CTS");
        Employee e1=new Employee(101,"Rajesh",25,"Trainer",12333.33);
        e1.setProject(p2);
        System.out.println(e1);
    }
}
