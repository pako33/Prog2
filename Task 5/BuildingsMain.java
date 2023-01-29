import java.util.ArrayList;
import java.util.Scanner;

public class BuildingsMain {
    public static void main(String[] args) {
        int dwellings;
        double area;
        int rooms;
        int typeChoice;
        String name;
        String address;
        String choice;
        Building building;
        Plot plot;
        String residentName;

        Scanner input = new Scanner(System.in);

        System.out.print("Give a name to the Plot: ");
        name = input.nextLine();

        System.out.print("Give an address to the Plot: ");
        address = input.nextLine();

        do {
            System.out.print("Give the area of the Plot: ");
            area = input.nextDouble();
            input.nextLine();
            if (area < 0) {
                System.out.println("Only use positive values");
            }
        } while (area < 0);

        System.out.println("Assign the type of the Building: ");
        System.out.println("Block of Flats -> 1");
        System.out.println("Terraced House -> 2");
        System.out.println("Detached House -> 3");
        while (true) {
            typeChoice = input.nextInt();
            input.nextLine();
            if (typeChoice < 1 || typeChoice > 3) {
                System.out.println("wrong input, Try again!");
                continue;
            } else {
                break;
            }
        }

        do {
            System.out.print("Give Area of the Building: ");
            area = input.nextDouble();
            input.nextLine();
            if (area < 0) {
                System.out.println("Only use positive values");
            }
        } while (area < 0);

        System.out.print("Give the amount of Residents: ");
        dwellings = input.nextInt();
        input.nextLine();

        System.out.print("Give the amount of rooms: ");
        rooms = input.nextInt();
        input.nextLine();

        System.out.print("Give the name of the resident: ");
        residentName = input.nextLine();

        switch (typeChoice) {
            case 1:
                building = new ApartmentHouse(dwellings, area, rooms, new Resident(residentName));
                break;
            case 2:
                building = new TerraceHouse(dwellings, area, rooms, new Resident(residentName));
                break;
            case 3:
                building = new DetachedHouse(dwellings, area, rooms, new Resident(residentName));
                break;
            default:
                building = new Building();
                break;
        }

        plot = new Plot(name, address, area, building);

        do {
            System.out.print("Add new Resident yes = 1 no = 2? ");
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Give them a name: ");
                    name = input.nextLine();
                    plot.getBuilding().setResident(name);
                    break;

                case "2":
                    choice = "2";
                    break;

                default:
                    break;
            }
        } while (choice != "2");

        plot.printInfo();
        input.close();
    }
}