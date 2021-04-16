package eg1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Accessing EMS using RevatureEMS");
        RevatureEMS rems=new RevatureEMS();
        rems.createEmployee();
        rems.updateEmployee();
        rems.searchEmployee();
        rems.commonEmpFeature();
        rems.removeEmployee();

        System.out.println("\nAccessing EMS using CtsEmployee");
        CtsEmployee cems=new CtsEmployee();
        cems.createEmployee();
        cems.updateEmployee();
        cems.searchEmployee();
        cems.commonEmpFeature();
        cems.removeEmployee();
    }
}
