package egoverride;

public class MobileV1 {

    public void calling(){
        System.out.println("Calling from V1");
    }
    public void textMessage(){
        System.out.println("Text message from V1");
    }
      protected void displayMenu(){
        System.out.println("Menu in V1 gets displayed as LIST view");
    }
}
//public -> protected -> default ->private