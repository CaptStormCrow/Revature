package eg1;
public abstract class EMS {
    public abstract void createEmployee();
    public abstract void updateEmployee();
    public abstract void searchEmployee();
    public abstract void removeEmployee();

    public void commonEmpFeature(){
        System.out.println("Common feature for any Employee");
    }
}
