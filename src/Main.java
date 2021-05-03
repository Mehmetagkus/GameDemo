
public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "123456789", "Mehmet", "Ağkuş", "11/09/1999", "mehmetagkus376@gmail.com", "şifre123");
		User user2 = new User(2, "987654321", "Engin", "Demiroğ", "01/01/199?", "engindemirog@gmail.com", "şifre456");

		UserManager userManager = new UserManager();
		userManager.signIn(user1);
		userManager.signUp(new EdevletVerification(), user1);

		System.out.println();
		userManager.signIn(user2);
		userManager.signUp(new EdevletVerification(), user2);

		System.out.println();
		userManager.update(user1);
		System.out.println();

		Campaign campaign1 = new Campaign(1, "Yarısı Bizden", 50,
				" 100TL ve üzeri oyun alış-verişlerinde yarısını biz ödüyoruz.");

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.campaingAdd(campaign1);
		campaignManager.campaingUpdate(campaign1);
		System.out.println();

		GameSale game1 = new GameSale(1, "CS:GO", "2012", 80);
		GameSale game2 = new GameSale(2, "GTA V", "2013", 200);
		System.out.println();

		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.add(game1);
		gameSaleManager.add(game2);

		gameSaleManager.buy(game2, user1, campaign1);
		gameSaleManager.remove(game1);
		System.out.println();

		campaignManager.campaingRemove(campaign1);

		gameSaleManager.toReturn(game2, user1);
		System.out.println();

		userManager.delete(user1);
		userManager.signOut(user1);

	}

}
