package StatePattern;

public class Employee {
    private String name;
    private String department;
    private State positionState;

    public Employee() {
    }

    public Employee(String name, String department, State positionState) {
        this.name = name;
        this.department = department;
        this.positionState = positionState;
    }

    public void handleRequest() {
        positionState.handleRequest();
    }

    public void promote() {
        if (positionState instanceof ManagerState) {
            System.out.println("Can not promote from manager.");
        } else if (positionState instanceof OfficerState) {
            System.out.println("Employee is promoted to leader.");
            positionState = new LeaderState();
        } else if (positionState instanceof ProducerState) {
            System.out.println("Employee is promoted to officer.");
            positionState = new OfficerState();
        } else if (positionState instanceof LeaderState) {
            System.out.println("Employee is promoted to manager.");
            positionState = new ManagerState();
        }
    }

    public void setPositionState(State positionState) {
        this.positionState = positionState;
    }

    public State getPositionState() {
        return positionState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", positionState=" + positionState +
                '}';
    }


}
