
public class CampaignManager {
	public void campaingAdd(Campaign campaign) {
		System.out.println(campaign.getCampaingName() + " kampanyası ile " + campaign.getDiscountRate()
				+ " oranında hediye " + campaign.getDetail());
	}

	public void campaingRemove(Campaign campaign) {
		System.out.println("Bilginize! " + campaign.getCampaingName() + " kampanyası kaldırılmıştır.");
	}

	public void campaingUpdate(Campaign campaign) {
		System.out.println("Bilginize! " + campaign.getCampaingName()
				+ " kampanyası güncellenmiştir. Detaylı bilgi için web sitemizi ziyaret etmeyi unutmayınız.");
	}
}
