
public class CheckingAccount extends BankAccount {
    private static final double FEE = 0.15; // $0.15 fee per check

    public CheckingAccount(String name, double amount) {
        super(name, amount);
        // Set account number to parent's account number + "--10"
        setAccountNumber(getAccountNumber() + "--10");
    }

    @Override
    public boolean withdraw(double amount) {
        // Add fee to the amount and call parent's withdraw method
        return super.withdraw(amount + FEE);
    }
}