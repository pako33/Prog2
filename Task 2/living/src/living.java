import java.util.*;

class living {
	static plot[] all_plots;
	static int occupied_plots = 0;

    private static plot find_plot(String name) {
     	for (int i=0; i < occupied_plots; i++) {
            if (all_plots[i].get_name() == name) {
                return all_plots[i];
           }
        }
        return all_plots[0];
    }

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		all_plots = new plot[999];

        System.out.println("Input the plot name");
		String p_name = sc.nextLine();
		System.out.println("Input the plot location");
		String p_loc = sc.nextLine();
		System.out.println("Input the plot area");
		int p_area = Integer.parseInt(sc.nextLine());
        all_plots[occupied_plots] = new plot(p_name, p_loc, p_area);
        occupied_plots++;

		System.out.println("Input the building plot");
        String b_name = sc.nextLine();
		System.out.println("Input the building area");
        int b_area = Integer.parseInt(sc.nextLine());
        System.out.println("Input the amount of rooms in the building");
        int b_rooms = Integer.parseInt(sc.nextLine());
        System.out.println("Input the amount of residents in the building");
        int b_occp = Integer.parseInt(sc.nextLine());
        plot plt = find_plot(b_name);
        plt.set_building(b_area, b_rooms, b_occp);

        System.out.println("Input the resident name");
        String r_name = sc.nextLine();
        System.out.println("Input the resident's birthday");
        String r_bday = sc.nextLine();
        System.out.println("Input the resident's home plot name");
        String r_home = sc.nextLine();
        plt = find_plot(r_home);
        building bld = plt.get_building();
        bld.add_resident(r_name, r_bday);

		for (int p = 0; p < occupied_plots; p++) {
			building b = all_plots[p].get_building();
			all_plots[p].print();
			b.print();
			for (int r = 0; r < b.get_occp(); r++) {
				b.get_residents(r).print();
			}
		}
				
        // all_plots[0].print();
        // all_plots[0].get_building().print();
        // all_plots[0].get_building().get_residents(0).print();
       
        
	}
}
