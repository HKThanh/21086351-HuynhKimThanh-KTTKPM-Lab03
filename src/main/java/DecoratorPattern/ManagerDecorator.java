package DecoratorPattern;

public class ManagerDecorator extends Decorator {
    public ManagerDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void doTask() {
        super.doTask();
        System.out.println(employee.toString() + "is also managing the team.");
    }
}
