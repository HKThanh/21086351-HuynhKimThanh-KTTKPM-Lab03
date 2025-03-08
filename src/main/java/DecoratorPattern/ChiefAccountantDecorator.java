package DecoratorPattern;

public class ChiefAccountantDecorator extends Decorator {
    public ChiefAccountantDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void doTask() {
        super.doTask();
        System.out.println(employee.toString() + "is also managing the finance.");
    }
}
