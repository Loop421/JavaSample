/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drcho_000
 */
import java.util.ArrayList;


public class Bank {
    ArrayList<Customer> customers = new ArrayList<Customer>();
    
    void addCustomer(Customer customer) {
        customers.add(customer);
    }

    Customer getCustomer(int account) {
        return customers.get(account);
    }
    
    ArrayList<Customer> getCustomers(){
        return customers;
    }
    
}
