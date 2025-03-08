package StatePattern;

public class ManagerState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Manager is managing the team.");
    }
}
