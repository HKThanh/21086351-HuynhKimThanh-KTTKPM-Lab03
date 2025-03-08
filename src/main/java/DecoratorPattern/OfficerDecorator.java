package DecoratorPattern;

public class OfficerDecorator extends Decorator {
    public OfficerDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void doTask() {
        super.doTask();
        System.out.println(employee.toString() + "is working on the paperwork.");
    }
}
