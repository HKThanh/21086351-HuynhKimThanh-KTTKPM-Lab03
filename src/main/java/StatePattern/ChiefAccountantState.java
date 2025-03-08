package StatePattern;

public class ChiefAccountantState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Chief accountant is managing the finance");
    }
}
