package StrategyPattern;

public class OfficerStrategy implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("Officer is managing the team.");
    }
}
