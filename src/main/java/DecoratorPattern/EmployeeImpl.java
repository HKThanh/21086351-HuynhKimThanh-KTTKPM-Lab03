package DecoratorPattern;

public class EmployeeImpl implements Employee {
    private String name;
    private String department;

    public EmployeeImpl(String name, String department) {
        this.name = name;
        this.department = department;
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
    public void doTask() {
        System.out.println("Employee " + name + " is working in " + department + " department.");
    }

    @Override
    public String toString() {
        return name + " from " + department + " " + " is a employee, ";
    }
}
