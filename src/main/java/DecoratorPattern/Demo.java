package DecoratorPattern;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new EmployeeImpl("John", "Finance");
        employee.doTask();
        System.out.println("-----");

        Employee chiefAccountantDecorator = new ChiefAccountantDecorator(employee);
        chiefAccountantDecorator.doTask();

        System.out.println("-----");
        Employee producerDecorator = new ProducerDecorator(employee);
        producerDecorator.doTask();
    }
}
