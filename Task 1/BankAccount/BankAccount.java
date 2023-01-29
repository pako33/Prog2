
public class BankAccount {
	private String id;
	private String nm;
	private double bal;
	public BankAccount(String nm, String id, double bal) { //Setting up the parametric constructor
		this.nm = nm;
		this.id = id;
		this.bal = bal;
	}
	public void set_bal(double bal) { //Setting up basic functions for the program
		if(bal>=0) {
			this.bal = bal;
		}
	}
	public void set_id(String id) {
		this.id = id;
	}
	public void set_nm(String nm) {
		this.nm = nm;
	}
	public String get_nm() {
		return this.nm;
	}
	public String get_id() {
		return this.id;
	}
	public double get_bal() {
		return this.bal;
	}
	public void deposit (double amount) { //Deposit must be greater or equal to zero, can't deposit a negative value
		if(amount>=0) {
			this.bal+=amount;
		}
	}	
	public void withdraw (double amount) { //Withdrawal amount must be smaller than equal to account balance, if greater then no withdrawal will be made.
		if(amount>=0) {
			if(amount<=this.bal) {
				this.bal-=amount;
			}
		}
	}	
	public void print () {
		System.out.println("Account Owner: " + nm + ", Account ID: " + id + ", Account Balance: " + bal +"Euro");
	}
}
