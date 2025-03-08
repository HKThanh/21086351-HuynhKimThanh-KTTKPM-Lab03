package StrategyPattern;

public class Employee {
    private String name;
    private String department;
    private Strategy strategy;

    public Employee(String name, String department, Strategy strategy) {
        this.name = name;
        this.department = department;
        this.strategy = strategy;
    }

    public void doSomething() {
        strategy.doSomething();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + "]";
    }
}
