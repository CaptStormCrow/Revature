package eg2;

public class Project {
    private int projectid;
    private String projectName;
    private String clientName;

    public Project(int projectid, String projectName, String clientName) {
        this.projectid = projectid;
        this.projectName = projectName;
        this.clientName = clientName;
    }

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectid=" + projectid +
                ", projectName='" + projectName + '\'' +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
