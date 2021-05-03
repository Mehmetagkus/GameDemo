
public class Campaign {
	private int id;
	private String campaingName;
	private int discountRate;
	private String detail;

	public Campaign(int id, String campaingName, int discountRate, String detail) {
		this.id = id;
		this.campaingName = campaingName;
		this.discountRate = discountRate;
		this.detail = detail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
