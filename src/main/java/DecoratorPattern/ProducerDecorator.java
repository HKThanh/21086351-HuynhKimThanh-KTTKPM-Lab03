package DecoratorPattern;

public class ProducerDecorator extends Decorator {
    public ProducerDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void doTask() {
        super.doTask();
        System.out.println(employee.toString() + "is producing the product.");
    }
}
