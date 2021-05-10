package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {
    public void add(Campaign campaign) {
        System.out.println("Kampanya olu�turuldu: " + campaign.getCampaignName());
    }

    public void delete(Campaign campaign) {
        System.out.println("Kampanya silindi: " + campaign.getCampaignName());
    }

    public void update(Campaign campaign) {
        System.out.println("Kampanya g�ncellendi: " + campaign.getCampaignName());
    }

    public void printAllItems(Campaign campaign) {
        System.out.println("T�m kampanyalar getirildi.");
    }
}