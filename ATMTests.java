public class ATMTests {

    // Test 1: always true
    public static boolean testPinAlwaysTrue() {
        ATM atm = new ATM(500);
        atm.insertCard();
        atm.enterPin(1234);
        return true;   // REQUIRED: always validates true
    }

    // Test 2: actual logic (true/false)
    public static boolean testWithdraw() {
        ATM atm = new ATM(500);
        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(100);
        return atm.getBalance() == 400;
    }
}
