package concretes;

import abstracts.SalesService;
import entities.Campaign;
import entities.Customer;
import entities.Order;
import entities.Product;

public class SalesManager implements SalesService {
	@Override
	public void sellWithCampaign(Customer customer, Product product, Campaign campaign, Order order) {
		System.out.println("Sipariş gerçekleştirildi. " + customer.getFirstName() + " isimli müşteriye, "
				+ product.getProductName() + " adlı ürün, " + campaign.getCampaignName() + " kampanyası ile "
				+ order.getDiscountAmount(product, campaign) + " tl indirim uygulanarak, "
				+ order.getAmountOfPayment(product, campaign) + " tl fiyatıyla satılmıştır.");
	}

	@Override
	public void sellWithoutCampaign(Customer customer, Product product, Order order) {
		System.out.println("Sipariş gerçekleştirildi. " + customer.getFirstName() + " isimli müşteriye, "
				+ product.getProductName() + " adlı ürün " + order.getTotalAmount(product));
	}
}
