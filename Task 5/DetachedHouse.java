public class DetachedHouse extends Building {
    private String type;

    public DetachedHouse() {
        super();
        this.type = "Detached House";
    }

    public DetachedHouse(int dwellings, double area,
            int rooms, Resident resident) {
        super(dwellings, area, rooms, resident);
        this.type = "Detached House";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void printInfo() {
        System.out.println("Building Type: " + this.type);
        super.printInfo();
    }

}