package StrategyPattern;

public class ChiefAccountantStrategy implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("Chief accountant is managing the finance.");
    }
}
