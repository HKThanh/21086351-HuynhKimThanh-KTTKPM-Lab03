package DecoratorPattern;

public class LeaderDecorator extends Decorator {
    public LeaderDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void doTask() {
        super.doTask();
        System.out.println(employee + "is leading the team.");

    }
}
