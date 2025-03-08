package StatePattern;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Engineering", new ProducerState());
        employee.handleRequest();
        employee.promote();
        employee.handleRequest();
        employee.promote();
        employee.handleRequest();
        employee.promote();
        employee.handleRequest();
        employee.promote();
        employee.handleRequest();
    }
}
