package labor6_1;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name){
        this.name = name;
    }

    public Customer getCustomer(int customerId){
        //return customer.get(customerId)
        for(Customer customer:customers){
            if(customer.getId() == customerId){
                return customer;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer){
        if(customer!= null){
            customers.add(customer);
        }
    }
}
