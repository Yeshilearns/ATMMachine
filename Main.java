public class Main {
    public static void main(String[] args) {
        // Demonstration of ATM behavior
        System.out.println("=== ATM DEMO ===");
        ATM atm = new ATM(500);

        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(100);

        // Run tests
        System.out.println("\n=== ATM TESTS ===");
        System.out.println("Test 1 (Always True): " + ATMTests.testPinAlwaysTrue());
        System.out.println("Test 2 (Withdraw Test): " + ATMTests.testWithdraw());
    }
}
