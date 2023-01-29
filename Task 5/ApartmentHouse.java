public class ApartmentHouse extends Building {
    private String type;

    public ApartmentHouse() {
        super();
        this.type = "Apartment House";
    }

    public ApartmentHouse(int dwellings, double area, int rooms, Resident resident) {
        super(dwellings, area, rooms, resident);
        this.type = "Apartment House";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void printInfo() {
        System.out.println("Building Type: " + this.type);
        super.printInfo();
    }
}