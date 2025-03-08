package StrategyPattern;

public class ManagerStrategy implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("Manager is managing the team.");
    }
}
