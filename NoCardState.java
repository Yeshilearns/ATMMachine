public class NoCardState implements State {

    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card inserted.");
        atm.setState(new HasCardState());
    }

    @Override
    public void enterPin(ATM atm, int pin) {
        System.out.println("Please insert a card first.");
    }

    @Override
    public void withdrawCash(ATM atm, int amount) {
        System.out.println("Please insert a card first.");
    }
}
