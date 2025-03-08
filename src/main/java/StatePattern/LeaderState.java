package StatePattern;

public class LeaderState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Leader is leading the team.");
    }
}
