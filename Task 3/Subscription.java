public class Subscription {
	private String nm;
	private String user;
	private String address;
	private Double price;
	public Subscription(String nm, String user, String address, Double price) {
		this.nm = nm;
		this.user = user;
		this.address = address;
        this.price = price;
    }
    public void set_nm(String nm) {
		this.nm = nm;
	}
	public void set_user(String user) {
		this.user = user;
    }
	public void set_address(String address) {
		this.address = address;    
	}
    public void set_price(Double price) {
		this.price = price;    
	}
	public String get_nm() {
		return this.nm;
	}
	public String get_user() {
		return this.user; 
	}
	public String get_address() {
		return this.address;
	}
	public Double get_price() {
		return this.price;
	} 
    void printInvoice() {
    }
}
