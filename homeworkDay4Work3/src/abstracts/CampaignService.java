package abstracts;

import entities.Campaign;

public interface CampaignService {
    void add(Campaign customer);

    void delete(Campaign customer);

    void update(Campaign customer);

    void printAllItems(Campaign customer);
}