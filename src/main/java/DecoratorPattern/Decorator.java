package DecoratorPattern;

public abstract class Decorator implements Employee {
    protected Employee employee;

    public Decorator(Employee employee) {
        this.employee = employee;
    }

    public void doTask() {
        employee.doTask();
    }
}
