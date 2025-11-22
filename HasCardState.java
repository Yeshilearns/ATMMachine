public class HasCardState implements State {

    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card already inserted.");
    }

    @Override
    public void enterPin(ATM atm, int pin) {
        if (pin == atm.getCorrectPin()) {
            System.out.println("PIN correct.");
            atm.setState(new AuthenticatedState());
        } else {
            System.out.println("Incorrect PIN.");
        }
    }

    @Override
    public void withdrawCash(ATM atm, int amount) {
        System.out.println("Enter PIN before withdrawing.");
    }
}
