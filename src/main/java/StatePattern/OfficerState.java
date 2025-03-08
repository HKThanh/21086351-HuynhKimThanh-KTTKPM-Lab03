package StatePattern;

public class OfficerState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Officer is working on the project.");
    }
}
