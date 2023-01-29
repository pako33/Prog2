public class StandingSubscription extends Subscription {
    private int discount;
    public StandingSubscription(String nm, String user, String address, Double price, int discount) {
        super(nm, user, address, price);
        this.discount = discount;
    }
    public void set_discount(int discount) {
		this.discount = discount; 
	}
    public int get_discount() {
		return this.discount;
	}
    void printInvoice() {
        System.out.println("Journal Name: " + this.get_nm() + ", Subscriber's Name: " + this.get_user() + ", Subscriber's Address: " + this.get_address() + ", Standing Subscription Cost: " + 12 * this.get_price() * (100 - this.discount) / 100);
    }
}