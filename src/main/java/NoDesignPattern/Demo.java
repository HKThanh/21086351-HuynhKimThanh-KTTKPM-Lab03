package NoDesignPattern;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", "Manager");
        System.out.println(employee);
        employee.handleRequest();
    }
}
