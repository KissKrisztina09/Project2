package labor6_1;

public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer("Krisztina", "Kiss");
        customer1.addAccount(new SavingsAccount(0.15));
        customer1.addAccount(new CheckingAccount(1000));
        System.out.println(customer1);
        System.out.println(customer1.getNumAccounts());

    }
}
