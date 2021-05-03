
public class GameSale {
	private int id;
	private String gameName;
	private String releaseYear;
	private double price;

	public GameSale(int id, String gameName, String releaseYear, double price) {
		this.id = id;
		this.gameName = gameName;
		this.releaseYear = releaseYear;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
