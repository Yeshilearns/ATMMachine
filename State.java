public interface State {
    void insertCard(ATM atm);
    void enterPin(ATM atm, int pin);
    void withdrawCash(ATM atm, int amount);
}