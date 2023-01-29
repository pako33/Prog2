public class resident {
	private String name;
	private String bd;
	public resident(String name, String bd) {
		this.name = name;
		this.bd = bd;
	}
    public void set_name(String name) {
		this.name = name;
	}
	public void set_bd(String bd) {
		this.bd = bd;
    }
	public String get_name() {
		return this.name;
	}
	public String get_bd() {
		return this.bd;
	}

    public void print () {
		System.out.println("Resident's Name: " + name + ", Resident's Birthday: " + bd);
	}
}
