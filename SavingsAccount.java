
public class SavingsAccount extends BankAccount {
    private double rate = 0.025; // 2.5% annual interest rate
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double amount) {
        super(name, amount);
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    // Copy constructor
    public SavingsAccount(SavingsAccount oldAccount, double amount) {
        super(oldAccount, amount);
        this.savingsNumber = oldAccount.savingsNumber + 1;
        this.rate = oldAccount.rate;
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }

    public void postInterest() {
        // Calculate one month's interest and deposit it
        double monthlyInterest = getBalance() * rate / 12;
        deposit(monthlyInterest);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
}