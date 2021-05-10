package entities;

public class Campaign {
    private int id;
    private String campaignName;
    private int discountRate;

    public Campaign() {
    }

    public Campaign(int id, String campaignName, int discountRate) {
        this.id = id;
        this.campaignName = campaignName;
        this.discountRate = discountRate;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return this.campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
}