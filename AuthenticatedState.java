public class AuthenticatedState implements State {

    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card already inserted.");
    }

    @Override
    public void enterPin(ATM atm, int pin) {
        System.out.println("Already authenticated.");
    }

    @Override
    public void withdrawCash(ATM atm, int amount) {
        if (amount <= atm.getBalance()) {
            atm.setBalance(atm.getBalance() - amount);
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }

        System.out.println("Ejecting card...");
        atm.setState(new NoCardState());
    }
}
