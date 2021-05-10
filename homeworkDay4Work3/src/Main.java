import adapter.MernisCheckAdapter;
import concretes.*;
import entities.Campaign;
import entities.Customer;
import entities.Order;
import entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
            Customer customer = new Customer(1, "Emre", "Durmaz", 1980, "48693508472");
            Product product = new Product(1, "FIFA 2021", "Role Play", 450);
            Campaign campaign = new Campaign(1, "Ilkbahar", 35);
            Order order = new Order(1, 1, 1, 1, 1);

            CustomerManager customerManager = new CustomerManager(new MernisCheckAdapter());
            customerManager.add(customer);
            customerManager.delete(customer);
            customerManager.update(customer);

            ProductManager productManager = new ProductManager();
            productManager.add(product);
            productManager.delete(product);
            productManager.update(product);

            CampaignManager campaignManager = new CampaignManager();
            campaignManager.add(campaign);
            campaignManager.delete(campaign);
            campaignManager.update(campaign);

            OrderManager orderManager = new OrderManager();
            orderManager.add(order);
            orderManager.delete(order);
            orderManager.update(order);

            SalesManager salesManager = new SalesManager();
            salesManager.sellWithCampaign(customer, product, campaign, order);
            salesManager.sellWithoutCampaign(customer, product, order);
    }
}