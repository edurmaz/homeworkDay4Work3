package abstracts;

import entities.Campaign;
import entities.Customer;
import entities.Order;
import entities.Product;

public interface SalesService {
    void sellWithCampaign(Customer customer, Product product, Campaign campaign, Order order);

    void sellWithoutCampaign(Customer customer, Product product, Order order);
}
