package labor5_1;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private static int counter = 0;
    private static final String PREFIX = "OTP";
    private static final int ACCOUNT_NUMBER_LENGTH=10;
    public BankAccount(){
        ++counter;
        this.accountNumber = createAccountNumber();
    }

    private String createAccountNumber(){
        StringBuffer str = new StringBuffer();
        String counterStr = ""+counter; // String formabna lesz a counter
        int len = counterStr.length();
        str.append(PREFIX);
        for(int i=0; i<ACCOUNT_NUMBER_LENGTH-PREFIX.length()-len; ++i){
            str.append('0');
        }
        str.append(counterStr);
        return str.toString();
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