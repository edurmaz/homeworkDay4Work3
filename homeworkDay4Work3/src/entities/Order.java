package entities;

public class Order {
    int id;
    int customerId;
    int productId;
    int campaignId;
    int count;
    int totalAmount;
    int discountAmount;
    int amountOfPayment;

    public Order(int id, int customerId, int productId, int campaignId, int count) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.campaignId = campaignId;
        this.count = count;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCampaignId() {
        return this.campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalAmount(Product product) {
        return this.count * product.productPrice;
    }

    public int getDiscountAmount(Product product, Campaign campaign) {
        return product.productPrice * campaign.getDiscountRate() / 100;
    }

    public int getAmountOfPayment(Product product, Campaign campaign) {
        return this.getTotalAmount(product) - this.getDiscountAmount(product, campaign);
    }
}