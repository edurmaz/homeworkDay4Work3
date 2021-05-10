package concretes;

import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import entities.Customer;

public class CustomerManager implements CustomerService {
    private CustomerCheckService checkService;

    public CustomerManager(CustomerCheckService checkService) {
        this.checkService = checkService;
    }

    public void add(Customer customer) throws Exception {
        if (this.checkService.check(customer)) {
            System.out.println("Do�rulama ba�ar�l�.  " + customer.getFirstName());
        } else {
            System.out.println("Do�rulama ba�ar�s�z ki�i eklenemedi!");
        }

    }

    public void delete(Customer customer) {
        System.out.println("M��teri silindi: " + customer.getFirstName());
    }

    public void update(Customer customer) {
        System.out.println("M��teri g�ncellendi: " + customer.getFirstName());
    }

    public void getAll(Customer[] customers) {
        for (Customer customer: customers){
            System.out.println("M��teriler: " + customer.getFirstName() + "\n");
        }

    }
}