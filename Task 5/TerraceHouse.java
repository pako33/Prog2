public class TerraceHouse extends Building {
    private String type;

    public TerraceHouse() {
        super();
        this.type = "Terraced House";
    }

    public TerraceHouse(int dwellings, double area,
            int rooms, Resident resident) {
        super(dwellings, area, rooms, resident);
        this.type = "Terraced House";
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