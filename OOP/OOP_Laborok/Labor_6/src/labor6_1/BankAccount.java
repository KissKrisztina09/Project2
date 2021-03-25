package labor6_1;

public class BankAccount {
    protected final String accountNumber;
    protected double balance;
    private static int counter = 0;
    private static final String PREFIX = "OTP";
    private static final int ACCOUNT_NUMBER_LENGTH=10;

    protected BankAccount(){
        ++counter;
        this.accountNumber = createAccountNumber();
    }

    private String createAccountNumber(){
        StringBuilder result = new StringBuilder();
        result.append(PREFIX + String.format("%07d", counter));
        return result.toString();
    }

    public void deposit(double amount){
        if(amount <= 0){
            return;
        }
        this.balance += amount;
    }

    public boolean withdraw(double amount){
        if(amount > balance){
            return false;
        }
        this.balance -= amount;
        return true;
    }

    //getter
    public String getAccountNumber(){
        return this.accountNumber;
    }

    //getter
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
