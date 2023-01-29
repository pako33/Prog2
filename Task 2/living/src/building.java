public class building {
	private int area;
	private int rooms;
	private int occp;
	private resident residents[];
	public building(int area, int rooms, int occp) {
		this.area = area;
		this.rooms = rooms;
		this.occp = occp;
		residents = new resident[rooms];
	}
	public void add_resident(String name, String bday) {
		this.residents[this.occp] = new resident(name, bday);
		this.occp++;
	}
    public void set_area(int area) {
		this.area = area;
	}
	public void set_rooms(int rooms) {
		this.rooms = rooms;
    }
	public void set_occp(int occp) {
		this.occp = occp;    
	}
	public int get_area() {
		return this.area;
	}
	public int get_rooms() {
		return this.rooms;
	}
	public int get_occp() {
		return this.occp;
	}
	public resident get_residents(int i) {
		return this.residents[i];
	}
    public void print () {
		System.out.println("Building Area: " + area + " square meters, Building Rooms: " + rooms + ", Building Occupants: " + occp);
	}
}
