package eg2;
//is - A relationship
public class Employee extends Person{
    private String designation;
    private double salary;
    private Project project; //has - A relationship

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Employee(int id, String name, int age, String designation, double salary) {
        super(id, name, age);
        this.designation = designation;
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "designation='" + designation + '\'' +
                ", salary=" + salary +
                ", project=" + project +
                "} " + super.toString();
    }
}
