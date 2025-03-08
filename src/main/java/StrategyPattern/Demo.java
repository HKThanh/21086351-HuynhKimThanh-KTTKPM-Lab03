package StrategyPattern;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Accounting", new ChiefAccountantStrategy());
        System.out.println(employee);
        employee.doSomething();

        employee.setStrategy(new ProducerStrategy());
        System.out.println(employee);
        employee.doSomething();
    }
}
