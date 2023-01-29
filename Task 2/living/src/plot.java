public class plot {
	private String name;
	private String loc;
	private int area;
	private building bld;
	public plot(String name, String loc, int area) {
		this.name = name;
		this.loc = loc;
		this.area = area;
    }
    public void set_building(int area, int rooms, int occp) {
		this.bld = new building(area, rooms, occp);
	}
    public void set_name(String name) {
		this.name = name;
	}
	public void set_loc(String loc) {
		this.loc = loc;
    }
	public void set_area(int area) {
		this.area = area;    
	}
	public building get_building() {
		return this.bld;
	}
	public String get_name() {
		return this.name;
	}
	public String get_loc() {
		return this.loc;
	}
	public int get_area() {
		return this.area;
	}
    public void print () {
		System.out.println("Plot Name: " + name + ", Plot Location: " + loc + ", Plot Area: " + area + " square metres");
	}
}

