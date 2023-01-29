import java.util.Scanner;

public class Vt4main {
    public static void main(String[] args) {

        double value;
        double lim;
        String loc;
        String type;
        int inpt;
        InsInfoContainer properties = new InsInfoContainer();

        try (Scanner input = new Scanner(System.in)) {
            do {
                System.out.println("Choose your next action by entering the desired numeric value");
                System.out.println("Create a new Property:                                               -> 1");
                System.out.println("Print all Properties                                                 -> 2");
                System.out.println("Print Properties with greater insurance values than the given amount:-> 3");
                System.out.println("Print Properties with lesser insurance values than the given amount: -> 4");
                inpt = input.nextInt();
                input.nextLine();

                switch (inpt) {
                    case 1:
                        System.out.print("Input the type of the Property: ");
                        type = input.nextLine();
                        System.out.println();

                        System.out.print("Input the location of the Property: ");
                        loc = input.nextLine();
                        System.out.println();

                        System.out.print("Give insurance value of the Property: ");
                        value = input.nextDouble();
                        input.nextLine();
                        System.out.println();

                        properties.addInfo((new InsuranceInfo((new Property(type, loc)), value)));
                        break;
                    case 2:
                        properties.printevery();
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Give the minimum Insurance amount: ");
                        lim = input.nextDouble();
                        input.nextLine();
                        properties.printBigger(lim);
                        System.out.println();
                        break;
                    case 4:
                        System.out.print("Give maximum Insurance amount: ");
                        lim = input.nextDouble();
                        input.nextLine();
                        properties.printSmaller(lim);
                        System.out.println();
                        break;
                    default:
                        System.out.println("Invalid input, only use the available options");
                        System.out.println();
                        break;
                }
            } while (inpt != 4);
        }
    }
}