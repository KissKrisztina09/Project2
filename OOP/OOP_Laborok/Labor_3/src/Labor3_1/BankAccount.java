package Labor3_1;

public class BankAccount {
    private String accountNumber;
    private double balance;
    //inicializal

    public BankAccount(String accountNumber){
        //shadowing elfedes
        //account number
        this.accountNumber = accountNumber;
    }

    public void deposit(double ammount){
        if ( ammount <=0){
            return;
        }
        this.balance += ammount;
    }

    public boolean withdraw( double ammount ){
        if ( ammount > balance){
            return false;
        }
        this.balance -= ammount;
        return true;
    }

    public String getAccountNumber(){
        return this.getAccountNumber();
    }

    public double getBalance(){
        return balance;
    }

    public String toString(){
        return "BankAccount{"+
                "accountNumber=" + accountNumber + '\''+
                ", balance="+balance +
                '}';
    }


}

