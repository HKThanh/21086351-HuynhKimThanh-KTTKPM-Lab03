package StrategyPattern;

public class LeaderStrategy implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("Leader is leading the team.");
    }
}
