package StatePattern;

public class ProducerState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Producer is producing the product.");
    }
}
