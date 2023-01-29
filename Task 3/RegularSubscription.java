public class RegularSubscription extends Subscription {
    private int rate;
    public RegularSubscription(String nm, String user, String address, Double price, int rate) { 
		super(nm, user, address, price);
        this.rate = rate;
    }
    public void set_rate(int rate) {
		this.rate = rate;
	}
    public int get_rate() {
		return this.rate;
	}
    void printInvoice() {
        System.out.println("Journal Name: " + this.get_nm() + ", Subscriber's Name: " + this.get_user() + ", Subscriber's Address: " + this.get_address() + ", Regular Subscription Cost: " + this.rate * this.get_price());
    }
}
