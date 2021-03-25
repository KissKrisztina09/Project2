package labor6_1;

public class SavingsAccount extends BankAccount {
    //BankAccount az os osztaly, amibol szarmaztattuk a SavingsAccount-ot
    private double interestRate;//kamatlab

    public SavingsAccount(double interestRate){
        //ososztaly contsructor hivasa: super(...)
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void addInterest(){
        this.balance += balance*interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
