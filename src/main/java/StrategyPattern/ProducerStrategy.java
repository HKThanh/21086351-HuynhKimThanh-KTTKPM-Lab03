package StrategyPattern;

public class ProducerStrategy implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("Producer is producing the product.");
    }
}
