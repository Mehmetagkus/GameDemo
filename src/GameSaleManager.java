
public class GameSaleManager {
	public void add(GameSale gameSale) {
		System.out.println(gameSale.getGameName() + " markete eklendi.");
	}

	public void remove(GameSale gameSale) {
		System.out.println(gameSale.getGameName() + " marketten kaldırıldı.");
	}

	public void buy(GameSale gameSale, User user, Campaign campaign) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + gameSale.getGameName() + " oyununu "
				+ campaign.getCampaingName() + " kampanyası ile satın aldı.");
	}

	public void toReturn(GameSale gameSale, User user) {
		System.out.println(
				user.getFirstName() + " " + user.getLastName() + " " + gameSale.getGameName() + " oyununu iade etti.");
	}
}
