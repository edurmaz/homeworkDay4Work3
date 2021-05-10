package abstracts;

import entities.Customer;

public interface CustomerService {
    void add(Customer customer) throws Exception;

    void delete(Customer customer);

    void update(Customer customer);

    void getAll(Customer[] customer);
}