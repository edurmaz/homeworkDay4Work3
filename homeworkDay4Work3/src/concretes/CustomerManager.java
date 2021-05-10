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
            System.out.println("Doðrulama baþarýlý.  " + customer.getFirstName());
        } else {
            System.out.println("Doðrulama baþarýsýz kiþi eklenemedi!");
        }

    }

    public void delete(Customer customer) {
        System.out.println("Müþteri silindi: " + customer.getFirstName());
    }

    public void update(Customer customer) {
        System.out.println("Müþteri güncellendi: " + customer.getFirstName());
    }

    public void getAll(Customer[] customers) {
        for (Customer customer: customers){
            System.out.println("Müþteriler: " + customer.getFirstName() + "\n");
        }

    }
}