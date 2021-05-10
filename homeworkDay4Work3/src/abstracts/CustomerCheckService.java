package abstracts;

import entities.Customer;

public interface CustomerCheckService {
	boolean check(Customer customer) throws Exception;
}