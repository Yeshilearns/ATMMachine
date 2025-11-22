public class ATM {
    private State currentState;
    private int balance;
    private final int correctPin = 1234;

    public ATM(int balance) {
        this.balance = balance;
        this.currentState = new NoCardState();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public int getCorrectPin() {
        return correctPin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public void insertCard() {
        currentState.insertCard(this);
    }

    public void enterPin(int pin) {
        currentState.enterPin(this, pin);
    }

    public void withdrawCash(int amount) {
        currentState.withdrawCash(this, amount);
    }
}
