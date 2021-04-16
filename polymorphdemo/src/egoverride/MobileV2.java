package egoverride;

public class MobileV2 extends MobileV1 {
    public void gaming(){
        System.out.println("Gaming from V2");
    }
    public void socialApp(){
        System.out.println("Soccial App from V2");
    }

    @Override
    public void displayMenu(){
        System.out.println("Menu view is updated to GRID view in MobileV2");
    }
}
