package NoDesignPattern;

public class Employee {
    private String name;
    private String department;
    private String position;

    public Employee() {
    }

    public Employee(String name, String department, String position) {
        this.name = name;
        this.department = department;
        this.position = position;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public void handleRequest() {
        switch (position) {
            case "Manager":
                System.out.println("Manager is managing the team.");
                break;
            case "officer":
                System.out.println("Officer is working on the paperwork.");
                break;
            case "producer":
                System.out.println("Producer is producing the product.");
                break;
            case "chief-accountant":
                System.out.println("Chief accountant is managing the finance.");
                break;
            case "leader":
                System.out.println("Leader is leading the team.");
                break;
            default:
                System.out.println("Not implement position.");
        }
    }
}
