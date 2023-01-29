import java.util.ArrayList;

public class Building {
    private int dwellings;
    private double area;
    private int rooms;
    private ArrayList<Resident> residents;

    public Building() {
        this.area = 0;
        this.dwellings = 0;
        this.residents = new ArrayList<>();
        this.rooms = 0;
    }

    public Building(int dwellings, double area, int rooms, Resident resident) {
        this.area = area;
        this.dwellings = dwellings;
        this.rooms = rooms;
        this.residents = new ArrayList<>();
        this.residents.add(resident);
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setdwellings(int dwellings) {
        this.dwellings = dwellings;
    }

    public void setResident(String name) {
        this.residents.add(new Resident(name));
    }

    public void setrooms(int rooms) {
        this.rooms = rooms;
    }

    public double getArea() {
        return this.area;
    }

    public int getdwellings() {
        return this.dwellings;
    }

    public ArrayList<Resident> getResidents() {
        return this.residents;
    }

    public int getrooms() {
        return this.rooms;
    }

    public void printInfo() {
        System.out.println("Number of dwellings: " + this.dwellings);
        System.out.println("Number of rooms: " + this.rooms);
        System.out.println("Area: " + this.area);
        System.out.print("Residents: ");
        for (Resident resident : residents) {
            resident.printInfo();
            System.out.print("");
        }
    }

}